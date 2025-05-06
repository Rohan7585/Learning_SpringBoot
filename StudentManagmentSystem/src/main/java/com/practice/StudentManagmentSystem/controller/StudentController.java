package com.practice.StudentManagmentSystem.controller;

import com.practice.StudentManagmentSystem.model.Student;
import com.practice.StudentManagmentSystem.service.StudentService;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    // Constructor Injection
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Add student: POST /students
    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    // Get all students: GET /students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.allStudent();
    }
}
