package com.dyp.spring.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    @Test
    public void testScope(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Object student1 = ioc.getBean("student");
        Object student2 = ioc.getBean("student");
        System.out.println(student1.equals(student2));
    }
}
