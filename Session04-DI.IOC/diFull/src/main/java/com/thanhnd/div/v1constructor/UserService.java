package com.thanhnd.div.v1constructor;



public class UserService {

   // private MailSender mailSender = new MailSender();
    // hard code, chủ động tạo object, truyền thống


    private MailSender mailSender;
    // không new mà cho đưa từ ben ngoài vào

    // có 3 cách để đưa MailSender vào UserService
    // cach 1: thông qua constructor, fill vào
    // cách 2: thông qua setter, set vào
    // cách 3: thông qua field injection, dùng annotation @Autowired, Spring sẽ tự động inject vào
     // ===========================
    // cách 1: thông qua constructor

    public UserService(MailSender mailSender) {
        this.mailSender = mailSender; // khởi tạo, gán vào
    }


    public void registerUser(String email) {
        // việc quan trọng, gui email
        System.out.println("Send mail to in Service: " + email);
        mailSender.sendNoti();

    }
}
