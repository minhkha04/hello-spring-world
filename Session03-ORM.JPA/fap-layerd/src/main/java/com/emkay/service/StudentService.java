package com.emkay.service;

import com.emkay.entity.Student;
import com.emkay.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
       return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(String id) {
        studentRepository.delete(id);
    }

    public void updateStudent(Student student) {
        studentRepository.update(student);
    }
}
