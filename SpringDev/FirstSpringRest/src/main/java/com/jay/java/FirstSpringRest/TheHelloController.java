package com.jay.java.FirstSpringRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class TheHelloController {

    @ResponseBody
    @GetMapping("hello")
    public String hello(){
        return "Hello Spring Boot WebService!";
    }
    
    @ResponseBody
    @GetMapping(value="enter/{name}")
    public String enterName(@PathVariable("name")String sname){
        return sname;
    }
    
}

