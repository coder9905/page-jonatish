package uz.zako.lesson51_page_jonatish.repository;// Author - Orifjon Yunusjonov
// t.me/coderr24

import com.example.lesson15.entity.Category;
import com.example.lesson15.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
