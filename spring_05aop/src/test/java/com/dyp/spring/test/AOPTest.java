package com.dyp.spring.test;

import com.dyp.spring.aop.annotation.Calculator;
import com.dyp.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public  void test(){
        ClassPathXmlApplicationContext aop = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = aop.getBean(Calculator.class);
        calculator.div(10,2);
    }
}
