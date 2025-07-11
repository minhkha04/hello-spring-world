package com.thanhnd.div.v3finalfantasy;

public class SmsSender implements NotiService{

    @Override
    public void sendNoti(String message) {
        System.out.println("(VIETELL) sms was sent !!! ");

        // thay vì phụ thuộc vào thằng cụ thể, ta phụ thuộc vao thứ chung chung
        // giúp ta dễ dàng thay đổi, mở rộng, bảo trì

        // Phụ thuộc vào interface, ứng với nguyên lý
        // Open to extension, closed to modification
        // cứ thêm sms thoai mái mà không cần sửa userservice

    }
}
