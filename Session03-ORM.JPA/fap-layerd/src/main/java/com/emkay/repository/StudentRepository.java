package com.emkay.repository;

import com.emkay.entity.Student;
import com.emkay.util.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentRepository {

    public void save(Student obj) {
        EntityManager em = JPAUtil.getEntityManager();

        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
    }

    public List<Student> findAll() {
        EntityManager em = JPAUtil.getEntityManager();
        return em.createQuery("SELECT s FROM Student s ", Student.class).getResultList();
    }

    public Student findById(String id) {
        EntityManager em = JPAUtil.getEntityManager();
        return em.find(Student.class, id);
    }

    public void delete(String id) {
        EntityManager em = JPAUtil.getEntityManager();
        Student student = findById(id);
        if (student != null) {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
        } else {
            System.out.println("Student not found with ID: " + id);
        }
    }

    public void update(Student student) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Student existingStudent = em.find(Student.class, student.getId());
        if (existingStudent != null) {
            em.merge(student);
            em.getTransaction().commit();
        } else {
            System.out.println("Student not found with ID: " + student.getId());
        }
        em.close();
    }
}
