package com.thanhnd.tightcoupling;

public class MainTightCoupling {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("thanhndse182854@fpt.edu.vn");

        // câu hỏi: tui muốn dùng sms thì sao ??, code thêm, nhưng sửa code đến đâu
        // sửa nhiều class, hay ít class
        // khong new MailSender()
        // giờ tui muốn dùng yahoo, ms mail để gửi


    }

}
