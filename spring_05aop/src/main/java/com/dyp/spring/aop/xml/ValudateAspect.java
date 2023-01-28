package com.dyp.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ValudateAspect {

    public void pointCut() {}

    public void beforeAdviceMethod(JoinPoint joinPoint) {
        System.out.println("ValudateAspect-->前置通知");
    }
}
