package uz.zako.lesson51_page_jonatish.service;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.payload.CatalogResponse;
import uz.zako.lesson51_page_jonatish.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    //    public boolean save(UserRequest userRequest);
    public List<CategoryResponse> getAllByCatalogId(Long id);
}
