package uz.zako.lesson51_page_jonatish.payload;// Author - Orifjon Yunusjonov

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// t.me/coderr24
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryResponse {
    private Long id;
    private String name;
    private String imageUrl;
}
