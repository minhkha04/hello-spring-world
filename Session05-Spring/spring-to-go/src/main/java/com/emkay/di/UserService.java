package com.emkay.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private EmailSender emailSender;

    @Autowired
    public UserService (UserRepository userRepository, EmailSender emailSender) {
        this.userRepository = userRepository;
        this.emailSender = emailSender;
    }x

    public void registerAccount() {
        userRepository.getAll();
        emailSender.sendMail();
    }
}
