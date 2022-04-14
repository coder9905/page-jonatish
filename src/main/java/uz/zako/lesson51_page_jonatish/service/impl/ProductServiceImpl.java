package uz.zako.lesson51_page_jonatish.service.impl;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.Attachment;
import uz.zako.lesson51_page_jonatish.entity.Product;
import uz.zako.lesson51_page_jonatish.entity.enums.ProductType;
import uz.zako.lesson51_page_jonatish.payload.ProductRequest;
import uz.zako.lesson51_page_jonatish.repository.*;
import uz.zako.lesson51_page_jonatish.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final AddressRepository addressRepository;
    private final AttachmentRepository attachmentRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(AddressRepository addressRepository, AttachmentRepository attachmentRepository, ProductRepository productRepository, UserRepository userRepository, CategoryRepository categoryRepository) {
        this.addressRepository = addressRepository;
        this.attachmentRepository = attachmentRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public boolean save(ProductRequest productRequest, Long categoryId) {
        Product product = new Product();
        product.setCategory(categoryRepository.findById(categoryId).orElseThrow(()->new RuntimeException("we not found categoryId")));
        product.setCharacter(productRequest.getCharacter());
        product.setName(productRequest.getName());
        product.setSalePercent(productRequest.getSalePercent());
        product.setPrice(productRequest.getPrice());
        product.setType(productRequest.getType());
        ProductType type = ProductType.SMARTPHONE;
        
        List<Attachment> attachmentList = new ArrayList<>();
//        Attachment attachment = new Attachment();
        for (int i = 0; i < productRequest.getAttachments().size(); i++) {
//            attachment =
            attachmentList.add(attachmentRepository.findByHashId(productRequest.getAttachments().get(i)));
        }
//        product.setAttachments(attachmentList);
// attachment
        return productRepository.save(product) != null;
    }

    public Page<ProductRequest> findAllByPage(int page, int size){
        PageRequest request = PageRequest.of(page, size);
        Page<ProductRequest> requests = productRepository.findAllByPage(request);
        for (int i = 0; i < requests.getContent().size(); i++) {
            requests.getContent().get(i).setAttachment(attachmentRepository.getByProductId(requests.getContent().get(i).getId()));
        }
        return requests;
    }
}
