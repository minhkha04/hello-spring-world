package com.emkay.tightcoupling;

public class EmailSender {
    public void sendMail(String recipient, String message){
        System.out.println("Mail send to " + recipient + " with message: " + message);
    }
}
