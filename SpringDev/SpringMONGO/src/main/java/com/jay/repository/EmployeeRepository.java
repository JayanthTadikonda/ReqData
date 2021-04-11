package com.jay.repository;

import com.jay.model.EmployeeModel;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Integer> {

}