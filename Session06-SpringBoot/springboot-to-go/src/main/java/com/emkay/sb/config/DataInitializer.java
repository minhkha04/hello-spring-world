package com.emkay.sb.config;

import com.emkay.sb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CREATE TABLE AND INSERT INTO SUCCESSFULLY");
        userService.save();
    }
}
