package com.dyp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")  // 即 ..../ContextRoot/
    public String protal(){
        return "index";
    }

    @RequestMapping("/hello")
    public String helloworld(){
        return "target";
    }
}
