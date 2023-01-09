package com.dyp.spring.proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test(){
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        int add = proxy.add(10, 2);
        int sub = proxy.sub(20, 3);
    }


    @Test
    public void proxyTest(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        int add = proxy.add(1, 2);
    }
}
