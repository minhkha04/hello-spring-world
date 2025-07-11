package com.emkay.entity.unimany;

import com.emkay.infra.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MainUniMany {

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
                .major(major1)
                .build();
        Student student2 = Student.builder()
                .id("SE11")
                .name("Bob")
                .yob(2002)
                .gpa(3.6)
                .major(major1)
                .build();

        Student student3 = Student.builder()
                .id("GD10")
                .name("Charlie")
                .yob(2000)
                .gpa(3.9)
                .major(major2)
                .build();
        Student student4 = Student.builder()
                .id("GD11")
                .name("Diana")
                .yob(2003)
                .major(major2)
                .gpa(3.7)
                .build();


        EntityManager em = JpaUtil.getEntityManager();
//        em.getTransaction().begin();
//        em.persist(major1);
//        em.persist(major2);
//        em.persist(student1);
//        em.persist(student2);
//        em.persist(student3);
//        em.persist(student4);
//        em.getTransaction().commit();
//        em.close();

        em = JpaUtil.getEntityManager();
        List<com.emkay.entity.unimany.Student> students = em.createQuery("SELECT s FROM Student s", com.emkay.entity.unimany.Student.class).getResultList();
        students.forEach(student -> System.out.println(student));
    }
}
