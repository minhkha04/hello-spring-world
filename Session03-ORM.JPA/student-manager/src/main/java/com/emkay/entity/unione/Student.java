package com.emkay.entity.unione;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

//@Entity
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
}
