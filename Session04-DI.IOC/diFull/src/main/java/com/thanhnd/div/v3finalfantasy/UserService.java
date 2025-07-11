package com.thanhnd.div.v3finalfantasy;

public class UserService {


//    private SmsSender smsSender;
//    private EmailSender emailSender;

    private NotiService notiService;

    public UserService(NotiService notiService) {
        this.notiService = notiService;
    }

    public void registerUser() {

        notiService.sendNoti("Welcome to our service!");

    }
}
