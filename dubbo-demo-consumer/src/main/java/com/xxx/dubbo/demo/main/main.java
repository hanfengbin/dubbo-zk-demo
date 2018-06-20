package com.xxx.dubbo.demo.main;

import com.xxx.dubbo.demo.service.GreetingService;
import com.xxx.dubbo.demo.service.SingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Serializable;

public class main{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        String greetMessage = greetingService.hello("韩大爷");
        System.out.println("Consumer ==> " + greetMessage);
        SingService singService= (SingService) context.getBean("singService");
        singService.sing("韩大爷");
        //context.destroy();
    }

}
