package com.dyp.spring.test;

import com.dyp.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//指定当前测试类在spring测试环境中执行，可以通过注入的方式直接获取IOC容器的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:tx-xml.xml")
public class TxByXMLTest {
    @Autowired
    private BookController bookController;
    @Test
    public void test(){
        bookController.buyBook(1,1);
    }

    @Test
    public void testOne(){
        bookController.checkout(1,new Integer[]{1,2});
    }
}
