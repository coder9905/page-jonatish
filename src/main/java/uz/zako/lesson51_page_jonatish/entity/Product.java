package uz.zako.lesson51_page_jonatish.entity;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.abstractEntity.AbstractEntity;
import uz.zako.lesson51_page_jonatish.entity.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product extends AbstractEntity {

    private String name;
    private String character;
    private Double price;
    private Double salePercent;

    @ManyToOne
    private Category category;

    @Enumerated(EnumType.STRING)
    private ProductType type;

//    @OneToMany
//    private List<Attachment> attachments;

}
