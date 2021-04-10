package com.jay.controller;

import com.jay.model.EmployeeModel;
import com.jay.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employeeModel){

        return employeeModel;
    }

    @GetMapping("/search/{name}")
    public EmployeeModel searchEmployee(@PathVariable ("name") EmployeeModel employeeModel){

        return employeeModel;
    }

    @DeleteMapping("/delete/{name}")
    public void deleteEmployee(@PathVariable ("name") EmployeeModel employeeModel){

    }

    @GetMapping("/find")
    public List<EmployeeModel> findAllEmployees(){

        return employeeService.getAllEmployees();
    }

    @PutMapping("/edit")
    public EmployeeModel editEmployee(@RequestBody EmployeeModel employeeModel){

        return employeeModel;
    }
    @GetMapping("/hi")
    public String printHi(){
        System.out.println("PRINTING HIII");
        return "Hello there";
    }
}
