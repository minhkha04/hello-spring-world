package com.emkay.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Table(name = "student")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
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
