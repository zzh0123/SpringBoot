package com.example.demo.controller;

import com.example.demo.domain.FastJsonTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author zzh
 * @create 2019-07-21 17:39
 * @desc 测试fastjson
 **/
@RestController
public class FastJsonTestController {

    @GetMapping("/fastjson")
    public FastJsonTest getFastJson(){
        FastJsonTest fastjsonTest = new FastJsonTest();
        fastjsonTest.setId(1);
        fastjsonTest.setString("fastjson test");
        fastjsonTest.setIgnore("ignore field");
        System.out.println("--date--" + new Date());
        fastjsonTest.setDate(new Date());
        return fastjsonTest;
    }
}
