package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     *  通过${}获取application.properties中自定义的属性
     * @return
     */

    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private Integer age;

    @Value("${pocket.address}")
    private String address;

    @GetMapping("/hello")
    public String helloWorld(){
        return "大家好，我的名字是 " + name
                + ", 我今年" + age + ",我在" + address + "工作";
    }

//    @GetMapping("/hello")
//    public String helloWorld(){
//        return "hello world!";
//    }
}
