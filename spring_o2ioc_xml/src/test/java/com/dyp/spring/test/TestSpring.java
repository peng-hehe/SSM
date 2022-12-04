package com.dyp.spring.test;

import com.dyp.spring.pojo.Clazz;
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

    //    类类型外部
    @Test
    public void studentClazzOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentClazzOne",Student.class);
        System.out.println(student);
    }

    //    内部
    @Test
    public void studentClazzTwo(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentClazzTwo",Student.class);
        System.out.println(student);
    }

    //    级联
    @Test
    public void studentClazzThree(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentClazzThree",Student.class);
        System.out.println(student);
    }


    //    数组
    @Test
    public void studentArray(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentHobby",Student.class);
        System.out.println(student);
    }

    //    list集合
    @Test
    public void clazzListOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazzListOne = ioc.getBean("clazzListOne", Clazz.class);
        System.out.println(clazzListOne);
    }

    @Test
    public void clazzListTwo(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazzListOne = ioc.getBean("clazzListTwo", Clazz.class);
        System.out.println(clazzListOne);
    }


//    map集合
//    CDATA节
    @Test
    public void studentMapOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentMapOne",Student.class);
        System.out.println(student);
    }

    @Test
    public void studentMapTwo(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentMapTwo",Student.class);
        System.out.println(student);
    }

//    P空间
    @Test
    public void studentP(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object studentSix = ioc.getBean("studentSix");
        System.out.println(studentSix);
    }



}
