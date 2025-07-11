package com.emkay.ioc.v1scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV1 {

    public static void main(String[] args) {
//        tạo ra 1 object  bao gồm tất cả các class có đấu dấu
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        tạo ra 1 vùng ram gọi là IoC container
//        chứa các object đc new sẵn (class nào có các đánh dấu @Component, @Service, @Repository, .....)
        HelloMessage helloMessage = context.getBean(HelloMessage.class);

        helloMessage.sayHello("hello");

    }
}

