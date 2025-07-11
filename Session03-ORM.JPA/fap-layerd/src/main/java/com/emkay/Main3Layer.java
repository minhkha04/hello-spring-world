package com.emkay;

import com.emkay.entity.Student;
import com.emkay.service.StudentService;

public class Main3Layer {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student student = Student.builder()
                .id("SE1")
                .name("Student 1")
                .yob(2004)
                .gpa(8.7)
                .build();

        studentService.saveStudent(student);
        studentService.getAllStudent().forEach(System.out::println);
//        Student student = studentService.getStudentById("SE1");
        System.out.println(student);
        student.setGpa(10);
        studentService.updateStudent(student);
        System.out.println(student);


    }



}
