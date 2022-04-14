package uz.zako.lesson51_page_jonatish.service;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    public boolean delete(String hashId);
    public Attachment findByHashId(String hashId);
    public void save(MultipartFile multipartFile);

}
