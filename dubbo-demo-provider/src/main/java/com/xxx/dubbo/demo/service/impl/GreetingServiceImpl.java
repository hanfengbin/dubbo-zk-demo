package com.xxx.dubbo.demo.service.impl;

import com.xxx.dubbo.demo.service.GreetingService;

import java.util.Date;

public class GreetingServiceImpl implements GreetingService {
    public String hello(String name) {
        System.out.println("HelloService服务被调用，调用的时间是：" + new Date());
        String greetMessage = "你好！！！" + name;
        return greetMessage;
    }
}
