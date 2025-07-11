package com.emkay.loosecoupling.di.v1contructor;

public class UserService {
    private UserRepository userRepository;
    private EmailSender emailSender;

    public UserService(EmailSender emailSender){
        this.emailSender = emailSender;
    }

    public void  registerUser(Account account){
        emailSender.sendMail("lenguyenminhkha1606@gmail.com", "OTP here");
    }
}
