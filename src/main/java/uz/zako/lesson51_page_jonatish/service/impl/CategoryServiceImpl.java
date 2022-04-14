package uz.zako.lesson51_page_jonatish.service.impl;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.Catalog;
import com.example.lesson15.payload.CatalogResponse;
import com.example.lesson15.payload.CategoryResponse;
import com.example.lesson15.repository.AttachmentRepository;
import com.example.lesson15.repository.CatalogRepository;
import com.example.lesson15.repository.CategoryRepository;
import com.example.lesson15.repository.ProductRepository;
import com.example.lesson15.service.CategoryService;
import com.example.lesson15.service.CatologService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final AttachmentRepository attachmentRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final CatalogRepository catalogRepository;

    public CategoryServiceImpl(AttachmentRepository attachmentRepository, ProductRepository productRepository, CategoryRepository categoryRepository, CatalogRepository catalogRepository) {
        this.attachmentRepository = attachmentRepository;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.catalogRepository = catalogRepository;
    }
//    @Override
//    public boolean save(ProductRequest productRequest, Long categoryId) {
//        Product product = new Product();
//        product.setCategory(categoryRepository.findById(categoryId).orElseThrow(()->new RuntimeException("we not found categoryId")));
//        product.setCharacter(productRequest.getCharacter());
//        product.setName(productRequest.getName());
//        product.setSalePercent(productRequest.getSalePercent());
//        product.setPrice(productRequest.getPrice());
//        product.setType(productRequest.getType());
//        List<Attachment> attachmentList = new ArrayList<>();
////        Attachment attachment = new Attachment();
//        for (int i = 0; i < productRequest.getAttachments().size(); i++) {
////            attachment =
//            attachmentList.add(attachmentRepository.findByHashId(productRequest.getAttachments().get(i)));
//        }
//        product.setAttachments(attachmentList);
//// attachment
//        return productRepository.save(product) != null;
//    }

    public List<CategoryResponse> getAllByCatalogId(Long id){
        return categoryRepository.findAllByCatalogId(id);
    }


}
