package uz.zako.lesson51_page_jonatish.service;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.payload.ProductRequest;
import uz.zako.lesson51_page_jonatish.payload.UserRequest;
import org.springframework.data.domain.Page;

public interface ProductService {
    public boolean save(ProductRequest productRequest, Long categoryId);
    public Page<ProductRequest> findAllByPage(int page, int size);
}
