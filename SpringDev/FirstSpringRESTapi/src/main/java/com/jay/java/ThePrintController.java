package com.jay.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThePrintController {

    @ResponseBody
    @GetMapping(name="/hello")
    public String printHello(){
        System.out.println("Hello SPRING");
        return "Hello";
    }
}
