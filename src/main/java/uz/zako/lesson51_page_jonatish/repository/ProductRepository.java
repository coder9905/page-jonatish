package uz.zako.lesson51_page_jonatish.repository;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.Catalog;
import uz.zako.lesson51_page_jonatish.entity.Product;
import uz.zako.lesson51_page_jonatish.payload.ProductRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select new uz.zako.lesson51_page_jonatish.payload.ProductRequest(p.id,p.name, p.character, p.price, p.salePercent, p.type) from Product p")
    Page<ProductRequest> findAllByPage(Pageable pageable);

//    @Query(value = "select a.hash_id from public.product p inner join public.attachment a on a.id = p.attachments[0].id limit 1", nativeQuery = true)
//    String getHeadAttachmentHashId(Long productId);
}
