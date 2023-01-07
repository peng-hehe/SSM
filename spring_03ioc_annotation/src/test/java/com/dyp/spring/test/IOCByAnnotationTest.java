package com.dyp.spring.test;

import com.dyp.spring.controller.UserController;
import com.dyp.spring.dao.UserDao;
import com.dyp.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {

    /**
     * Component
     * Controller
     * Service
     * Repository
     */

    @Test
    public void test(){

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);

//        UserService userService = ioc.getBean(UserService.class);
//        System.out.println(userService);
//
//        UserDao userDao = ioc.getBean(UserDao.class);
//        System.out.println(userDao);

    }
    @Test
    public void test1(){

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();

    }
}
