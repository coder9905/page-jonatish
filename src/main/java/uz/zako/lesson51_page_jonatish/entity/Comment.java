package uz.zako.lesson51_page_jonatish.entity;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.abstractEntity.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment extends AbstractEntity {
    private String body;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}
