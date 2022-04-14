package uz.zako.lesson51_page_jonatish.payload;// Author - Orifjon Yunusjonov

import lombok.Data;

// t.me/coderr24
@Data
public class UserRequest {
    private String fullName;

    private String phoneNumber;

    private String email;

    private String location;
}
