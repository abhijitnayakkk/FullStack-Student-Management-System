package com.arjuncodes.studentsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.repository.StudentRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class StudentService implements StudentServiceImpl{
   private final StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
      return studentRepository.save(student);
    }
    @Override
    public List<Student> getStudents() {
       return studentRepository.findAll();
    }
    
}
