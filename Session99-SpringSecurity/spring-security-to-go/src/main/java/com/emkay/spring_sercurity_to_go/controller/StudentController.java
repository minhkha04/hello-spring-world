package com.emkay.spring_sercurity_to_go.controller;

import com.emkay.spring_sercurity_to_go.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = List.of(
            new Student("1", "Alice", 85),
            new Student("2", "Bob", 90),
            new Student("3", "Charlie", 78)
    );

    @GetMapping("")
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("/csrf")
    public CsrfToken csrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("")
    public Student addStudent(@RequestBody Student student) {
        return student;
    }
}
