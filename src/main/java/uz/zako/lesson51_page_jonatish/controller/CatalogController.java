package uz.zako.lesson51_page_jonatish.controller;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.service.CatologService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatologService catologService;

    public CatalogController(CatologService catologService) {
        this.catologService = catologService;
    }

//
//    @PostMapping("/{categoryId}")
//    public ResponseEntity save(@PathVariable(name = "categoryId") Long id, @RequestBody ProductRequest productRequest){
//        boolean isSave = productService.save(productRequest, id);
//        return isSave?ResponseEntity.ok(new Result(true,"saved")):new ResponseEntity(new Result(false,"not saved something went wrong"), HttpStatus.BAD_REQUEST);
//    }
    @GetMapping
    public ResponseEntity all(){
        return ResponseEntity.ok(catologService.getAllCatalogWithCategories());
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
