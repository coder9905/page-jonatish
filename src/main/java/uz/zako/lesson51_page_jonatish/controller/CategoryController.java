package uz.zako.lesson51_page_jonatish.controller;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{catalogId}")
    public ResponseEntity findAllByCatalogId(@PathVariable Long catalogId){
        return ResponseEntity.ok(categoryService.getAllByCatalogId(catalogId));
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
