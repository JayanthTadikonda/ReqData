package com.jay.SpringSecurityGreeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityGreetService {

    @GetMapping("/login")
    public String login2(){
        return "login";
    }

    @RequestMapping("/")
    public String greetAll(){
        return "<h1>Hello Spring Security!<h1>";
    }

    @RequestMapping("/user")
    public String greetUser(){
        return "<h1>Hello USER!</h1>";
    }

    @RequestMapping("/admin")
    public String greetAdmin(){
        return "<h1>Hello ADMIN!</h1>";
    }

}
