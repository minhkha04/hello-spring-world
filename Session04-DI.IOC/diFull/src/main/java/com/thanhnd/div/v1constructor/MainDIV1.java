package com.thanhnd.div.v1constructor;




public class MainDIV1 {
    public static void main(String[] args) {

        UserService userService = new UserService(new MailSender());

        // main class là nơi tạo ra object dependency và truyền vào noi cần
        // main còn goị là container, nơi chứa các object, quản lý các object
        // hành động class không chủ động new, không chủ động kểm soat tạo dependency
        // nữa mà đưa cho nơi khác lo,ddaaaday la main

        userService.registerUser("hoangngoctrinh@gmail.com");

    }
}