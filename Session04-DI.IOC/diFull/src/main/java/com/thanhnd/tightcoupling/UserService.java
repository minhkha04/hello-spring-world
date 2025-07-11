package com.thanhnd.tightcoupling;

public class UserService {
    // lo nhiệm vụ liên quan đến người dùng, entity class, thông tin người dùng của app
    // bao gồm: thêm, xóa (xóa mem - set active = true/false), cập nhật thông tin người dùng, lấy thông tin người dùng, lấy danh sách người dùng, tìm kiếm người dùng theo tên, email, phone, id6

    // tuy nhiên phan mem user add() còn cần thêm 1 viêệc
    // gửi mail hoặc gửi tin nhắn đến hộp mail / sim của user !!!!
    // gửi mail hoặc gửi tin nhắn không dính đến userRepo class
    // gui --- controller -- service -- repo -- infra (em, emf )-- table thật
    // mà là xu lý khác, vào hộp mail, tạo mail, send, vào toong đài, send sms, số phone đăng ký

    // GUI -- CONTROLLER -- SERVICE -- REPOSITORY -- INFRASTRUCTURE
    // SOLID
    // S -> SINGLE RESPONSIBILITY PRINCIPLE (SRP)
    // 1 CLASS CHỈ NÊN TẬP TRUNG VÀO VIỆC NÓ MẠNH NHẤT, 1 CLASS KHÔNG ÔM ĐỒ CÁC CÔNG VIEC CỦA LĨNH VỰC KHÁC NHAU
    // 1 CLASS NẾU CẦN THAY ĐỔI, CHỈ NÊN CO 1 LÝ DO THAY ĐỔI

    // cần khai báo 1 object lo việc chuyên gửi mail
    // class service phụ thuộc vào class mailSender trong việc gửi mail
    // class MailSender sẽ lo việc gửi mail, không cần biết class UserService làm gì
    // class A cần class B để làm việc, class A phụ thuộc vào class B

    private MailSender mailSender = new MailSender();  // dependency của UserService,chủ động new để dùng gọi là
    //gọi là tightcoupling, direct, UserService phụ thuộc vào MailSender
    // chủ động tạo object

    public void registerUser(String email) {
     // việc quan trọng, gui email
        System.out.println("Send mail to in Service: " + email);
        mailSender.sendNoti();

    }


}
