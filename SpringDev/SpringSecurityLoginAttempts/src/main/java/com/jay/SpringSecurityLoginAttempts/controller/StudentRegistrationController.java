package com.jay.SpringSecurityLoginAttempts.controller;

import com.jay.SpringSecurityLoginAttempts.entity.Student;
import com.jay.SpringSecurityLoginAttempts.repository.StudentRepository;
import com.jay.SpringSecurityLoginAttempts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentRegistrationController {

    private String regSuccess = "Registration Successful !";

    @Autowired
    StudentRepository repository;

    @Autowired
    private StudentService service;

    @GetMapping("/register")
    public String login(){
        return "register";
    }

    @PostMapping("/register")
    public String studentRegistration(Student student){
        service.addStudent(student);
        return "success";
    }

    @GetMapping("/login2")
    public String loginWebsite(){
        return "login2";
    }

    @PostMapping("/login2")
    public String studentLogin(Student student, Model model){
       Student std =  service.getByUsername(student.getUsername());
       if(std.getFailedAttempts()>2){
           model.addAttribute("Student",std);
           return "error";
       }else {
           if (student.getPassword().equals(std.getPassword())) {
               std.setFailedAttempts(0);
               repository.save(std);
               model.addAttribute("Student",std);
               return "success";
           } else {
               std.setFailedAttempts(std.getFailedAttempts() + 1);
               repository.save(std);
               model.addAttribute("Student", std);
               return "error";
           }
       }
    }

}
