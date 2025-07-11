package com.emkay.entity.bionemany;

import com.emkay.infra.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MainBiOne {

    public static void main(String[] args) {
        getStudent("SE");
    }

    public static void create() {
        Major se = Major.builder()
                .id("SE")
                .name("Software Engineering")
                .build();

        Student s1 = Student.builder()
                .id("SE01")
                .name("Alice")
                .yob(2001)
                .gpa(3.8)
                .build();

        Student s2 = Student.builder()
                .id("SE02")
                .name("Jane")
                .yob(2002)
                .gpa(8)
                .build();

        se.addStudent(s1);
        se.addStudent(s2);

        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(se);
        em.getTransaction().commit();
        em.close();
    }

    public static void getStudent(String major) {
        EntityManager em = JpaUtil.getEntityManager();

        Major se = em.find(Major.class, major);
        List<Student> students = se.getStudent();
        students.forEach(System.out::println);
        List<Student> after = students.stream()
                .filter(x -> x.getId().trim().equalsIgnoreCase("SE01"))
                .toList();
        after.forEach(System.out::println);
    }

    public static void getMajorByStudentId(String id) {
        EntityManager em = JpaUtil.getEntityManager();
        Student student = em.find(Student.class, id);
        Major major = student.getMajor();
        System.out.println(major);
        em.close();
    }
}
