package com.example.smsusingspringmvc;

import com.example.smsusingspringmvc.entity.Student;
import com.example.smsusingspringmvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsUsingSpringMvcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SmsUsingSpringMvcApplication.class, args);
    }


    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
       /* Student student1 = new Student("Innocent","Charles","innocent@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Samuel", "Olawole","sammywealth@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Olumide", "Kolawole","oluski@gmail.com");
        studentRepository.save(student3);
         */

    }
}
