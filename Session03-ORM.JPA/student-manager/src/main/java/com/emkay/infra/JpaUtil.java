package com.emkay.infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

    //CLASS NÀY CHỊU TRÁCH NHIỆM KẾT NỐI CSDL THÔNG QUA ĐỐI TƯỢNG ENTITY-MANAGER-FACTORY, HAO RAM, PERFORMANCE, TỐN THỜI GIAN ĐỂ TẠO KÊNH KẾT NỐI VỚI SQL SERVER/MYSQL -> HEAVY CLASS
    //NÓ NÊN ĐC KHỞI TẠO SỚM, 1 LẦN, 1 INSTANCE, 1 VÙNG RAM, 1 OBJECT, SINGLETON
    //CHƯA KỂ MỖI LẦN NÓ ĐC TẠO RA, CÓ KHI NÓ SẼ TẠO MỚI TABLE LUÔN (OPTION CREATE TRONG .XML), HOẶC NÓ SCAN LẠI CẤU TRÚC TABLE CÓ THAY ĐỔI GÌ KO ĐÊ CẬP NHẬT (OPTION UPDATE TRONG .XML)

    //KĨ THUẬT VIẾT CODE MÀ KHIẾN CHO CLASS KO NEW ĐC LẦN THỨ 2, KO ĐC NEW NHIỀU OBJECT, LỠ MAY GỌI NHIỀU LẦN CÁI CLASS NÀY, CX CHỈ CÓ 1 VÙNG NEW ĐC TẠO RA
    //STATIC + PRIVATE CONSTRUCTOR
    //1 CLASS KO CÓ CONSTRUCTOR -> JVM SẼ TẠO 1 CÁI CTOR RỖNG, VẪN NEW OKIE LUÔN
    //CẤM TẠO OBJECT TỪ MỌI CONSTRUCTOR: CLASS KO CÓ CTOR, VÀ CTOR RÔNG MÌNH PHẾ LUÔN
    private static final EntityManagerFactory emf;
    //duy trì kết nối tớ CSDL, đọc file persistence.xml để tạo dựng/update table
    //heavy load nằm ở biến này!!!

    static {
        try {
            emf = Persistence.createEntityManagerFactory("com.emkay"); //load thông tin server từ file persistence.xml
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //cấm new class này
    //biến emf Factory chỉ có 1 con đường đc khởi tạo, khởi tạo 1 lần duy nhất qua đoạn lệnh trôi nổi static {} ở trên
    //KĨ THUẬT SINGLETON ĐÃ XONG - 1 OBJECT HEAVY ENTITY-MANAGER-FACTORY TRONG RAM
    private JpaUtil() {
    }

    //CÓ ÔNG NHÀ XƯỞNG FACTORY RÔI, ĐI MỜI CÁC ÔNG MANAGER VỀ QUẢN LÍ CÁC @ENTITY
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    //HÀM NÀY THÌ NHÓM REPOSITORY SẼ GỌI ĐẾN NHỜ VẢ XUỐNG TABLE
    //VÌ NÓ LÀ STATIC NÊN CHẤM XÀI LUÔN
    //JpaUtil.getEntityManager();

    //ĐÓNG CỬA NHÀ MÁY, KO CẦN CHƠI VỚI CSDL NỮA, KO DUY TRÌ KẾT NỐI NỮA KHI APP SHUTDOWN
    public static void shutdown() {
        emf.close();
    }
}
