package com.dyp.springmvc.controller;

import com.dyp.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ParamController {

    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String getParamByServletAPI(String username ,String password){
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/Param")
    public String getParamByServletAPI(
            @RequestParam("user") String username ,
            @RequestParam("pwd") String password,
            @RequestParam(value = "ali",required = false ,defaultValue = "哈哈哈" ) String alias,
            @CookieValue("JSESSIONID") String jsessionId){
        System.out.println("username:"+username+",password:"+password + ",alias：" + alias);
        return "success";
    }

    @RequestMapping("/mvc")
    public String getParam(
            @RequestHeader(value = "referer",required = false,defaultValue = "aaa") String referer,
            @CookieValue("JSESSIONID") String jsessionId) {
        System.out.println(referer);
        System.out.println(jsessionId);
        return "success";
    }
    @RequestMapping("/param/pojo")
    public String getParamPojo(User user){
        System.out.println(user);
        return "success";
    }

}
