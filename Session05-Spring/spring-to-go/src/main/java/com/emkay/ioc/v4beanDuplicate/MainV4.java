package com.emkay.ioc.v4beanDuplicate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV4 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloMessage sms = context.getBean("sms", HelloMessage.class);
        sms.sayHello();
        HelloMessage email = context.getBean("email", HelloMessage.class);
        email.sayHello();
    }
}
