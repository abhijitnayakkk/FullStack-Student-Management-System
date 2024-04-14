package com.arjuncodes.studentsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.service.StudentService;

import lombok.RequiredArgsConstructor;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {
    private final StudentService studentService;
    
    @PostMapping("/add")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/read")
    public List<Student> readStudent(){
        return studentService.getStudents();
    }
}
