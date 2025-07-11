package com.emkay.ioc.v2bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV2 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        HelloMessage helloMessage = (HelloMessage) context.getBean("helloMessage");
        helloMessage.sayHello();

        HelloMessage helloMessage1 = context.getBean(HelloMessage.class);
        helloMessage1.sayHello();
    }
}