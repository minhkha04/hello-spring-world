package com.thanhnd.div.v3finalfantasy;


public class EmailSender implements NotiService{

    @Override
    public void sendNoti(String message) {
        System.out.println("(GMAILL) mail was sent !!! ");
    }
}
