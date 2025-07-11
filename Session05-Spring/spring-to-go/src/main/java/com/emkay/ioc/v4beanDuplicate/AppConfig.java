package com.emkay.ioc.v4beanDuplicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("sms")
    public HelloMessage smsMessage() {
        return new HelloMessage("SMS");
    }

    @Bean("email")
    public HelloMessage emailMessage() {
        return new HelloMessage("EMAIL");
    }
}
