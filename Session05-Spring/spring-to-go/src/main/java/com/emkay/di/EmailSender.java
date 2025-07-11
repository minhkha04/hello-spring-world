package com.emkay.di;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    public void sendMail() {
        System.out.println("Email is sending...");
    }
}
