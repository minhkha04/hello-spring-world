package com.emkay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Nationalized;

@Setter
@Getter
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {
    @Id
    // String mặc đinh là varchar(255)
    @Column(columnDefinition = "CHAR(8)")
    private String id;

    @Nationalized
    // Nationalized dùng để lưu trữ chuỗi Unicode, thường dùng cho các ngôn ngữ có ký tự đặc biệt
    @Column(length = 50, nullable = false)
    private String name;
    private int yob;
    private double gpa;


}
