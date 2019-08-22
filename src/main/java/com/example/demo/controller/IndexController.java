package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zzh
 * @create 2019-07-21 12:18
 * @desc index
 **/
@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("userName", "振华");
        return modelAndView;
    }
}
