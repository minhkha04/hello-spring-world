package com.emkay.entity.unione;

import com.emkay.infra.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MainUniOne {

    public static void main(String[] args) {
        Major major1 = Major.builder()
                .id("SE")
                .name("Software Engineering")
                .build();
        Major major2 = Major.builder()
                .id("GD")
                .name("Graphic Design")
                .build();

        Student student1 = Student.builder()
                .id("SE10")
                .name("Alice")
                .yob(2001)
                .gpa(3.8)
                .build();
        Student student2 = Student.builder()
                .id("SE11")
                .name("Bob")
                .yob(2002)
                .gpa(3.6)
                .build();

        Student student3 = Student.builder()
                .id("GD10")
                .name("Charlie")
                .yob(2000)
                .gpa(3.9)
                .build();
        Student student4 = Student.builder()
                .id("GD11")
                .name("Diana")
                .yob(2003)
                .gpa(3.7)
                .build();
        major1.addStudent(student1);
        major1.addStudent(student2);
        major2.addStudent(student3);
        major2.addStudent(student4);

        EntityManager em = JpaUtil.getEntityManager();
//        em.getTransaction().begin();
//        em.persist(major1);
//        em.persist(major2);
//        em.getTransaction().commit();
//        em.close();

        em = JpaUtil.getEntityManager();
        List<Student> students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        students.forEach(student -> System.out.println(student));
    }
}
