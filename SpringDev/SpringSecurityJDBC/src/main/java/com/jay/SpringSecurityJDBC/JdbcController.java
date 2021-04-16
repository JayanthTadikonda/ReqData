package com.jay.SpringSecurityJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class JdbcController {

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @PutMapping(value ="/register{encode}")
//    public String passEncrypt(@PathVariable ("encode") String pass){
//        String encodedPass = bCryptPasswordEncoder.encode(pass);
//        return encodedPass;
//    }

    @GetMapping("/")
    public String helloAll(){
        return "Hello All";
    }

    @GetMapping("/user")
    public String helloUser(){
        return "Hello User";
    }

    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello Admin";
    }
}
