package uz.zako.lesson51_page_jonatish.payload;// Author - Orifjon Yunusjonov
// t.me/coderr24

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.zako.lesson15.payload.CategoryResponse;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CatalogResponse {
    private String name;
    private Long id;
    private List<CategoryResponse> categories;
}
