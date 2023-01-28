package com.dyp.spring.test;

import com.dyp.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopByXml {

    @Test
    public void test(){
        ClassPathXmlApplicationContext aop = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = aop.getBean(Calculator.class);
        calculator.add(3,4);
    }
}
