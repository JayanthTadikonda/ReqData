package com.jay.SpringMongoDb.service;

import com.jay.SpringMongoDb.model.EmployeeModel;
import com.jay.SpringMongoDb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    //--------------------------------------------------------------------------------
    public List<EmployeeModel> findAll() {
        return employeeRepository.findAll();
    }


    public EmployeeModel findByStudentNumber(String name) {
        return employeeRepository.findByName(name);
    }


    public EmployeeModel saveOrUpdateStudent(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }


    public void deleteStudentById(String id) {
        employeeRepository.deleteById(id);
    }
}
