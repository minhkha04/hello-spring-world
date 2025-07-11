package com.emkay;

import com.emkay.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.emkay.orm-PU");
    public static void main(String[] args) {

//        insertStudent();
//        printStudent();
//        searchStudent();
//        updateStudent();
        findById();
//        deleteStu dent();
    }

    public static void printStudent() {
        EntityManager em = emf.createEntityManager();

        List<Student> students = em.createQuery("SELECT s from Student s", Student.class).getResultList();
//        for (Student student : students) {
//            System.out.println(student);
//        }

        students.forEach(x -> System.out.println(x));
        students.forEach(x ->
                System.out.printf("ID: %s, Name: %s, YOB: %d, GPA: %.2f%n", x.getId(), x.getName(), x.getYob(), x.getGpa()));
        em.close();
        emf.close();
    }

    public static void insertStudent() {
        Student student = Student.builder()
                .id("SE3")
                .name("An Nguyễn")
                .yob(2004)
                .gpa(8)
                .build();

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void searchStudent() {
        EntityManager em = emf.createEntityManager();

        double id = 8;

        List<Student> results = em.createQuery("SELECT s FROM Student s WHERE s.gpa = :id ", Student.class)
                .setParameter("id", id)
                .getResultList();

        results.forEach(x -> System.out.println(x));

        em.close();
        emf.close();
    }

    public static void findById() {

        EntityManager em = emf.createEntityManager();

        String id = "SE3";

        Student student = em.find(Student.class, id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found with ID: " + id);
        }

        em.close();
        emf.close();
    }

    public static void updateStudent() {
        EntityManager em = emf.createEntityManager();
        String id = "SE3";

        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        student.setName("NEW NAME");
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    public static void deleteStudent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.emkay.orm-PU");
        EntityManager em = emf.createEntityManager();
        String id = "SE3";

        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        em.remove(student);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}