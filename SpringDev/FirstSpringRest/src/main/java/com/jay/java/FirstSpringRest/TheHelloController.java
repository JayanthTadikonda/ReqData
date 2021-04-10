package com.jay.java.FirstSpringRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


@Controller
public class TheHelloController {

    @ResponseBody
    @GetMapping("hello")
    public String hello(){
        return "Hello Spring Boot WebService!";
    }
    
    @ResponseBody
    @GetMapping(value="enter/{name}")
    public String enterName(@Valid @PathVariable ("name")@NotBlank String sname){
        return sname;
    }
    
}

