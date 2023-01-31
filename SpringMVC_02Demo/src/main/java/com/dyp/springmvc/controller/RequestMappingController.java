package com.dyp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class RequestMappingController {
    //此时请求映射所映射的请求的请求路径为：/test/hello
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.GET,RequestMethod.POST},
            params = {"username","!password","age=18","gender!=男"}
    )
    public String testRequestMapping(){
        return "hello";
    }

    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id, @PathVariable("username") String username){
        System.out.println("id:"+id+",username:"+username);
        return "hello";
    }
    //最终输出的内容为-->id:1,username:admin


}
