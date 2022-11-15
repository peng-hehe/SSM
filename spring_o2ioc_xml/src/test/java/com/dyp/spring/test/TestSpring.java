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
//扩展，继承或实现
    @Test
    public void testSpring4(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person student = ioc.getBean(Person.class);
        System.out.println(student);
    }

//    set注入

    @Test
    public void testSpring5(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentOne",Student.class);
        System.out.println(student);
    }

    //    构造器注入

    @Test
    public void testSpring6(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentTwo",Student.class);
        System.out.println(student);
    }

//    null
    @Test
    public void testSpring7(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentThree",Student.class);
        String s = student.getSname().toString(); //报空指针异常
        System.out.println(s);
        System.out.println(student);
    }
    //    xml实体
    @Test
    public void testSpring8(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentFour",Student.class);
        System.out.println(student);
    }

    //    CDATA节
    @Test
    public void testSpring9(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentFive",Student.class);
        System.out.println(student);
    }

    //    CDATA节
    @Test
    public void testSpring10(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentSix",Student.class);
        System.out.println(student);
    }

    //    CDATA节
    @Test
    public void testSpring11(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentSeven",Student.class);
        System.out.println(student);
    }



}
