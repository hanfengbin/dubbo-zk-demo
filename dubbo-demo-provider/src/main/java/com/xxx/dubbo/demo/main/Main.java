package com.xxx.dubbo.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //此方法非阻塞，可以通过另起线程的方式来进行保持provider的服务一直保持。
        context.start();
        //也可以通过
        System.in.read();
//        new Thread(new Runnable() {
//            public void run() {
//                ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                        "applicationContext.xml");
//                context.start();
//                try {
//                    System.in.read();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
    }
}
