package com.arjuncodes.studentsystem.service;

import java.util.*;

import com.arjuncodes.studentsystem.model.Student;

public interface StudentServiceImpl {
    public Student saveStudent(Student student);
    public List<Student> getStudents();
}
