package com.emkay.ioc.v3beanDuplicate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV3 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloMessage sms = context.getBean(HelloMessage.class);
        sms.sayHello();
        HelloMessage email = (HelloMessage) context.getBean("emailMessage");
        email.sayHello();
    }
}
