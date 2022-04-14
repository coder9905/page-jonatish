package uz.zako.lesson51_page_jonatish.payload;// Author - Orifjon Yunusjonov

import com.example.lesson15.entity.Attachment;
import com.example.lesson15.entity.Category;
import com.example.lesson15.entity.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

// t.me/coderr24
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private Long id;
    private String name;
    private String character;
    private Double price;
    private Double salePercent;
    private ProductType type;
    private List<String> attachments;
    private String attachment;
    //    private List<Attachment> attachments;


    public ProductRequest(Long id, String name, String character, Double price, Double salePercent, ProductType type) {
        this.id = id;
        this.name = name;
        this.character = character;
        this.price = price;
        this.salePercent = salePercent;
        this.type = type;
    }

    public ProductRequest(Long id, String name, String character, Double price, Double salePercent, ProductType type, String attachment) {
        this.id = id;
        this.name = name;
        this.character = character;
        this.price = price;
        this.salePercent = salePercent;
        this.type = type;
        this.attachment = attachment;
    }
}
