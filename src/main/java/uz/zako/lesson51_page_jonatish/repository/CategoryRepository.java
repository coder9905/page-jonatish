package uz.zako.lesson51_page_jonatish.repository;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.Catalog;
import uz.zako.lesson51_page_jonatish.entity.Category;
import uz.zako.lesson51_page_jonatish.payload.CategoryResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

//    List<Category> findAllByCatalogId(Long id);


    @Query("select new uz.zako.lesson51_page_jonatish.payload.CategoryResponse(c.id,c.name, c.attachment.hashId) from Category c where c.catalog.id=?1")
    List<CategoryResponse> findAllByCatalogId(Long id);
}
