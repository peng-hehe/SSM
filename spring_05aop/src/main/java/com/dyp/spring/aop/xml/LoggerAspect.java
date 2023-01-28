package com.dyp.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerAspect {

    //公共的表达式
    public void pointCut(){}

    //表达式定位到目标类的目标方法
    //只能增强一个add方法
    //@Before("execution(public int com.dyp.spring.aop.annotation.CalculatorImpl.add(int,int))")
    //增强所有方法
    // *任意访问修饰符和返回类型,*类中任意的方法,..任意的参数
    public void beforeAdviceMethod(JoinPoint joinPoint){
        System.out.println("LoggerAspect,前置通知");
        //获取连接点的签名信息（方法名）
        String name = joinPoint.getSignature().getName();
        //获取目标方法的实参信息
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect，方法名：" + name + "，参数：" + Arrays.toString(args));
    }

    public void afterAdviceMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("LoggerAspect,方法名:" + name + "执行完毕");
    }


    //获取目标方法的返回值
    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("LoggerAspect方法：" + name + "结果：" + result);
    }

    public void afterThrowingAdviceMethod(JoinPoint joinPoint , Exception ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("LoggerAspect方法：" + name + "异常：" + ex);
    }




    public Object aroundAdviceMethod(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        try {
            System.out.println("环绕通知-->前置通知");
            //目标对象方法的执行
            result = proceedingJoinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable e) {
            System.out.println("环绕通知-->异常通知");
            throw new RuntimeException(e);
        } finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;
    }

}
