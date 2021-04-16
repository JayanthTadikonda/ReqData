package com.jay.java.FirstSpringRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


@RestController
//@RequestMapping("/api")
public class TheHelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot WebService!";
    }

//    @GetMapping(value="enter/{name}")
//    public String enterName(@Valid @PathVariable ("name")@NotBlank String sname){
//        return sname;
//    }
    
}

