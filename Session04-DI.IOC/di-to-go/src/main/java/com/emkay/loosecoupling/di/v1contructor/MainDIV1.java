package com.emkay.loosecoupling.di.v1contructor;

public class MainDIV1 {


    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        UserService userService = new UserService(emailSender);

        userService.registerUser(new Account());
    }
}
