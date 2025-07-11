package com.thanhnd.div.v2setter;



public class MainSetter {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.setMailSender(new MailSender());
        userService.registerAccount("thanhnd@gmail.com");
    }
}
