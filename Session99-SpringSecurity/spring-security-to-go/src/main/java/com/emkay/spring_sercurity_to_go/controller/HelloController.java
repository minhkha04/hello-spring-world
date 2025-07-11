package com.emkay.spring_sercurity_to_go.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        log.info(request.getSession().getId());
        return "Hello, Spring Security to Go!";
    }

}
