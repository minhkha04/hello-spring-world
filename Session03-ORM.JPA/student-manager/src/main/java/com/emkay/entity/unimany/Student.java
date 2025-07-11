package com.emkay.entity.unimany;

import jakarta.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "major_id")
    Major major;
}
