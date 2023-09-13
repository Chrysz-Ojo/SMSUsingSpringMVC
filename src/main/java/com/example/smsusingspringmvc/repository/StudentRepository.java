package com.example.smsusingspringmvc.repository;

import com.example.smsusingspringmvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
