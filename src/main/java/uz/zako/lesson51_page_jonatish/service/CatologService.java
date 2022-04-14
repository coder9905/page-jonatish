package uz.zako.lesson51_page_jonatish.service;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.payload.CatalogResponse;
import uz.zako.lesson51_page_jonatish.payload.UserRequest;

import java.util.List;

public interface CatologService {
//    public boolean save(UserRequest userRequest);
public List<CatalogResponse> getAllCatalogWithCategories();
}
