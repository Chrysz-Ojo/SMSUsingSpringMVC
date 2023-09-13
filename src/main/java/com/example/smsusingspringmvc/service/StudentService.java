package com.example.smsusingspringmvc.service;


import com.example.smsusingspringmvc.entity.Student;
import com.example.smsusingspringmvc.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
      Student saveStudent(Student student);
      Student getStudentById(Long id);
      Student updateStudent(Student student);
      void deleteStudentById(Long id);

    }


