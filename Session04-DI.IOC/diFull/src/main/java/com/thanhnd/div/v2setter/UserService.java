package com.thanhnd.div.v2setter;

public class UserService {

    // trao quyền new dependency cho người khác gọi la IoC;
    // object được đưa từ bên ngoài được gọi là dependency injection

    private MailSender mailSender; // =  new MailSender();

    // chích qua con đường set, bị vấn đề null không go hàm này
    // chích qua constructor luôn đảm bảo rằng có dependency,được đuưa vào

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender; // setter, setter method
    }

    public void registerAccount(String email) {
        mailSender.sendNoti();


    }
}
