package com.emkay.ioc.v3beanDuplicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary//ưu tiên lấy thằng này
    public HelloMessage smsMessage() {
        return new HelloMessage("SMS");
    }

    @Bean
    public HelloMessage emailMessage() {
        return new HelloMessage("EMAIL");
    }
}
