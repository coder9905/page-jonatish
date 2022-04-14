package uz.zako.lesson51_page_jonatish.service.impl;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.Attachment;
import uz.zako.lesson51_page_jonatish.entity.Catalog;
import uz.zako.lesson51_page_jonatish.entity.Category;
import uz.zako.lesson51_page_jonatish.entity.Product;
import uz.zako.lesson51_page_jonatish.payload.CatalogResponse;
import uz.zako.lesson51_page_jonatish.payload.CategoryResponse;
import uz.zako.lesson51_page_jonatish.payload.ProductRequest;
import uz.zako.lesson51_page_jonatish.repository.*;
import uz.zako.lesson51_page_jonatish.service.CatologService;
import uz.zako.lesson51_page_jonatish.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatologService {

    private final AttachmentRepository attachmentRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final CatalogRepository catalogRepository;

    public CatalogServiceImpl(AttachmentRepository attachmentRepository, ProductRepository productRepository, CategoryRepository categoryRepository, CatalogRepository catalogRepository) {
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

    public List<CatalogResponse> getAllCatalogWithCategories(){
        List<Catalog> catalogList = catalogRepository.findAll();
        List<CatalogResponse> catalogResponseList = new ArrayList<>();
        for (int i = 0; i < catalogList.size(); i++) {
            catalogResponseList.add(new CatalogResponse(catalogList.get(i).getName(),catalogList.get(i).getId(),categoryRepository.findAllByCatalogId(catalogList.get(i).getId())));
        }
        return catalogResponseList;
    }


}
