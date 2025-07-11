package com.emkay.entity.unione;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

//@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Table(name = "major")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Major {
    @Id
    @Column(name = "id", columnDefinition = "CHAR(2)")
    String id;
    @Column(name = "name", columnDefinition = "NVARCHAR(100)")
    String name;

    // 1 major can have many students
    // fetch: 1 load vào ram, thì N có theo luôn hay không
    // EAGER: load 1 major thì sẽ load luôn danh sách student
    // LAZY: load 1 major thì không load luôn danh sách student, mà khi nào cần thì mới load
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "major_id")
    @ToString.Exclude
    @Builder.Default
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
}
