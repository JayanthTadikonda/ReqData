package com.jay;

import com.jay.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Integer> {

}