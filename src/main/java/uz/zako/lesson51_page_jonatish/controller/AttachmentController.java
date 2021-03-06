package uz.zako.lesson51_page_jonatish.controller;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileUrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;
import java.net.URLEncoder;


@RestController
@RequestMapping("/file")
public class AttachmentController {

    @Autowired
    private AttachmentService fileService;

    @Value("${upload.folder}")
    private String uploadFolder;

    @PostMapping("/save")
    public void save(@RequestParam(name = "file") MultipartFile multipartFile){
        fileService.save(multipartFile);
    }

//    @GetMapping("/preview/{hashId}")
//    public ResponseEntity preview(@PathVariable String hashId) throws MalformedURLException {
//        File file = fileService.findByHashId(hashId);
//        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "inline; fileName=\""+ URLEncoder.encode(file.getName()))
//                .contentType(MediaType.parseMediaType(file.getContentType()))
//                .body(new FileUrlResource(String.format("%s/%s",
//                        uploadFolder,
//                        file.getUploadPath())));
//    }
//
//    @GetMapping("/download/{hashId}")
//    public ResponseEntity download(@PathVariable String hashId) throws MalformedURLException {
//        File file = fileService.findByHashId(hashId);
//        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; fileName=\""+ URLEncoder.encode(file.getName()))
//                .contentType(MediaType.parseMediaType(file.getContentType()))
//                .body(new FileUrlResource(String.format("%s/%s",
//                        uploadFolder,
//                        file.getUploadPath())));
//    }
//
//    @DeleteMapping("/delete/{hashId}")
//    public ResponseEntity delete(@PathVariable String hashId) throws MalformedURLException {
//        boolean isDelete = fileService.delete(hashId);
//        if (!isDelete){
//            return new ResponseEntity(new Result(false, "not deleted"), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return ResponseEntity.ok(new Result(true,"deleted"));
//    }
}
