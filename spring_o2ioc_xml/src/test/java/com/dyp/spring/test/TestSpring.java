package com.dyp.spring.test;

import com.dyp.spring.pojo.HelloWorld;
import com.dyp.spring.pojo.Person;
import com.dyp.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

//    ①方式一：根据id获取
    @Test
    public void testSpring1(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)ioc.getBean("studentOne");
        System.out.println(student);
    }

//②方式二：根据类型获取(常用),
// 配置多个时会报错
// 正常不会配置多个，可以设置单例和多例
    @Test
    public void testSpring2(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean(Student.class);
        System.out.println(student);
    }

//③方式三：根据id和类型
    @Test
    public void testSpring3(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentTwo",Student.class);
        System.out.println(student);
    }

    @Test
    public void testSpring4(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person student = ioc.getBean(Person.class);
        System.out.println(student);
    }

}
