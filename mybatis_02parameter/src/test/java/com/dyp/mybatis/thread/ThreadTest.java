package com.dyp.mybatis.thread;

public class ThreadTest {
    // 未加锁的普通方法测试
        public static void main(String[] args) throws InterruptedException {
            Date date = new Date();

            // 开启一个A线程执行 fun1() 方法
            new Thread(()->{
                try {
                    date.fun1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"A").start();


            // 主线程休眠1秒
            Thread.sleep(1000);


            // 开启一个B线程执行 fun2() 方法
            new Thread(()->{
                try {
                    date.fun2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"B").start();
        }
    }

    class Date{
        // 未加synchronized修饰
        public void fun1() throws InterruptedException {
            // 延迟3秒后继续运行
            Thread.sleep(3000);
            System.out.println("fun1......");
        }
        // 未加synchronized修饰
        public void fun2() throws InterruptedException {
            // 直接运行
            System.out.println("fun2......");
        }
    }



