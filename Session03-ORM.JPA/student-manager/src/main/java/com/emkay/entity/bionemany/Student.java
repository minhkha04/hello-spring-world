package com.emkay.entity.bionemany;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Table(name = "student")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @Column(columnDefinition = "CHAR(8)")
    String id;
    @Column(columnDefinition = "NVARCHAR(100)", nullable = false)
    String name;
    @Column(nullable = false)
    int yob;
    double gpa;

    @ManyToOne()
    @JoinColumn(name = "major")
    Major major;

    public void setMajor(Major obj) {
        major = obj;
//        obj.addStudent(this);
    }

}
