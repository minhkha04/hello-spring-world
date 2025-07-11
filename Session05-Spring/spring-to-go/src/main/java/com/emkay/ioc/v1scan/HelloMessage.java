package com.emkay.ioc.v1scan;

import org.springframework.stereotype.Component;

@Component
public class HelloMessage {

    public void sayHello(String mess) {
        System.out.println("Ioc Container " + mess);
    }
}
