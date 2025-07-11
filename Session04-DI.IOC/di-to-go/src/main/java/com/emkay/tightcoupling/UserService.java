package com.emkay.tightcoupling;

public class UserService {

    private UserRepositiory userRepositiory = new UserRepositiory();
    private EmailSender emailSender = new EmailSender();

    public void registerUser(Account account){
        emailSender.sendMail("lenguyenminhkha1606@gmail.com", "OTP của bạn là 123456");
    }
}
