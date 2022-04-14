package uz.zako.lesson51_page_jonatish.controller;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.payload.UserRequest;
import uz.zako.lesson51_page_jonatish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String save(@RequestBody UserRequest userRequest){
        boolean isSave = userService.save(userRequest);
        return isSave?"yaratildi":"yaratilmadi";
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
