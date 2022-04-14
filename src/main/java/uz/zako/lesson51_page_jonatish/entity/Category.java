package uz.zako.lesson51_page_jonatish.entity;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.abstractEntity.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.zako.lesson15.entity.Attachment;
import uz.zako.lesson15.entity.Catalog;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category extends AbstractEntity {

    private String name;

    @OneToOne
    private Attachment attachment;

    @ManyToOne
    private Catalog catalog;

}
