package com.jay.SpringMongoDb.controller;

import com.jay.SpringMongoDb.model.EmployeeModel;
import com.jay.SpringMongoDb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/")
    public List<EmployeeModel> getAllEmployees() {
        List<EmployeeModel> list = employeeService.findAll();
        list.forEach(s-> System.out.println(s.toString()));
        return list;
    }

}
