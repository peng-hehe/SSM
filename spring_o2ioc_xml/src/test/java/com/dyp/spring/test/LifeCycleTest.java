package com.dyp.spring.test;

import com.dyp.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {


    @Test
    public void test(){
        //ConfigurableApplicationContext是ApplicationContext的子接口
        //扩展来刷新和关闭容器的方法
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean );
        ioc.close();
    }
}
