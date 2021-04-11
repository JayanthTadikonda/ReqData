package com.jay.service;

import com.jay.model.EmployeeModel;
import com.jay.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeModel> getAllEmployees(){
        List<EmployeeModel> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public EmployeeModel searchEmp(int id){
        return employeeRepository.findById(id).get();
    }

    public void deleteEmp(int id){
        employeeRepository.deleteById(id);
    }

    public EmployeeModel editEmp(EmployeeModel employeeModel, int id){
        employeeRepository.save(employeeModel);
        System.out.println("Employee Updated: " + employeeModel.toString());
        return employeeModel;
    }
}
