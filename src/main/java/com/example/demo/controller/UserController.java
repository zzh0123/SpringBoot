package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
       return userService.getUsers();
    }

    @GetMapping("/lists")
    public List<User> lists(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize){
        PageHelper.startPage(pageNo, pageSize);
        return userService.getUsers();
    }
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") String id){
        return userService.selectById(id);
    }

//    @GetMapping("/users")
//    public List<User> lists(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
//        PageHelper.startPage(pageNo,pageSize);
//        return userService.getUsers();
//    }

    @GetMapping("/del/{id}")
    public String delUser(@PathVariable("id") String id){
        userService.evictUser(id);
        return "删除成功";
    }
}
