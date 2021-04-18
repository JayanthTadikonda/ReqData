package com.jay.SpringSecurityLoginAttempts.service;

import com.jay.SpringSecurityLoginAttempts.entity.Student;
import com.jay.SpringSecurityLoginAttempts.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addStudent(Student student){
        Student student1 = populateStudent(student);
        studentRepository.save(student1);
        return "Student Added !";
    }

    public Student populateStudent(Student student){
        Student student1 = new Student();
        student.setId(student.getId());
        student1.setUsername(student.getUsername());
        student1.setPassword(passwordEncoder.encode(student.getPassword()));
        return student1;
    }

    public Student getByUsername(String name){
       Student std =  studentRepository.findByUsername(name);
        return std;
    }


}
