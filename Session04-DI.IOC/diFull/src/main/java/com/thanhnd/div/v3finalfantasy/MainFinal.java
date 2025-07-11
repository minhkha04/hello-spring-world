package com.thanhnd.div.v3finalfantasy;




public class MainFinal {

    public static void main(String[] args) {

        NotiService smsSender = new SmsSender();
        EmailSender mailSender = new EmailSender();

        // muon xai thang nao thi chi can truyen vao

        UserService userService = new UserService(smsSender);
        userService.registerUser();

        // thach thuc danh hai, sms qua mobile
        // tao class roi mobisms implement NotiService{}
        // anonymous class
        // class take away

        NotiService mobi = new NotiService() {
            @Override
            public void sendNoti(String message) {
                System.out.println("(Mobiphone) sms was sent !!! ");
            }
        };

        UserService userService2 = new UserService(mobi);
        userService2.registerUser();

    }
}
