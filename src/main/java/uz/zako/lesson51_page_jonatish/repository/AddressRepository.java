package uz.zako.lesson51_page_jonatish.repository;// Author - Orifjon Yunusjonov
// t.me/coderr24

import com.example.lesson15.entity.Address;
import com.example.lesson15.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
