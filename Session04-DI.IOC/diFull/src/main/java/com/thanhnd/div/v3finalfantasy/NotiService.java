package com.thanhnd.div.v3finalfantasy;

public interface NotiService {

    // là những class cha, clb, chỉ chứa hàm không code (sau này có hàm, có code)
    // là hàm abstract, cbl chỉ nói ve luật chơi
    // anh em than gia clb, thì thực thi luật chơi
    // clb đua xe, thì nhiệm vụ của anh em, implement mọi hình thức đua

    public void sendNoti(String message); // không có code

    // interface sinh ra để thống nhất, cách đặt tên hàm cho 1 class
    // chỉ cần gọi 1 tên hàm, anh em hưởng ứng, tính đa hình, polymorphyism
    // rảnh kh biết làm gì đọc cuốn sách: design patterns của gof gang of four

}
