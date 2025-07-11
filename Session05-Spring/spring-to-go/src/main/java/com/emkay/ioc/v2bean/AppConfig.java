package com.emkay.ioc.v2bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.emkay.ioc.v2bean")
public class AppConfig {

    @Bean
    //object này sẽ đi vào container và object này có tên theo tên hàm
    public HelloMessage helloMessage() {
        return new HelloMessage();
//        chủ động new object bằng tay như truyền thống nhưng sau đó đẩy object cho container quản lý
    }
}
//cách 1 tự new vd:package noioc
//cách 2 tự động new qua @ComponentScan vd:package v1scan
//cách 3 chủ động new sau đó đưa cho container quản lý vd:package v2bean
//cách 4 sử dụng XML PATH CONFIGURATION