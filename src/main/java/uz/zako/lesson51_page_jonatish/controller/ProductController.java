package uz.zako.lesson51_page_jonatish.controller;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.model.Result;
import uz.zako.lesson51_page_jonatish.payload.ProductRequest;
import uz.zako.lesson51_page_jonatish.payload.UserRequest;
import uz.zako.lesson51_page_jonatish.service.ProductService;
import uz.zako.lesson51_page_jonatish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/{categoryId}")
    public ResponseEntity save(@PathVariable(name = "categoryId") Long id, @RequestBody ProductRequest productRequest){
        boolean isSave = productService.save(productRequest, id);
        return isSave?ResponseEntity.ok(new Result(true,"saved")):new ResponseEntity(new Result(false,"not saved something went wrong"), HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/all")
    public ResponseEntity all(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "8") int size){
//        boolean isSave = productService.save(productRequest, id);
        return ResponseEntity.ok(productService.findAllByPage(page,size));
    }
//
//    @GetMapping("/{groupId}")
//    public ResponseEntity getUsersByGroupId(@PathVariable Long groupId){
//        return ResponseEntity.ok(new ResultSuccess(true,usersService.getUsersByGroupId(groupId)));
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity update(@PathVariable Long id, @RequestBody UserRequest userRequest){
//
//        return usersService.update(userRequest,id)?ResponseEntity.ok(new Result(true,"updated"))
//                : new ResponseEntity(new Result(false,"not update"), HttpStatus.BAD_REQUEST);
//    }

}
