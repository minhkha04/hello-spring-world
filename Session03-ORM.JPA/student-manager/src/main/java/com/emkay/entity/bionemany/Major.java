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
@Table(name = "major")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Major {
    @Id
    @Column(name = "id", columnDefinition = "CHAR(2)")
    String id;
    @Column(name = "name", columnDefinition = "NVARCHAR(100)")
    String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "major"
    )
    @Builder.Default
    @ToString.Exclude
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        student.setMajor(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setMajor(null);
    }

    public List<Student>  getStudent() {
        return students;
    }
}
