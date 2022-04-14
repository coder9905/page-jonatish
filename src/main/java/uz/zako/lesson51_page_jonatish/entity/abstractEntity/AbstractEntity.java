package uz.zako.lesson51_page_jonatish.entity.abstractEntity;// Author - Orifjon Yunusjonov

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

// t.me/coderr24
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@MappedSuperclass
abstract public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private Date createAt;

    @UpdateTimestamp
    private Date updateAt;
}
