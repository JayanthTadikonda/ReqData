package com.jay.SpringMongoDb.repository;

import com.jay.SpringMongoDb.model.EmployeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface EmployeeRepository extends MongoRepository<EmployeeModel, Integer> {
        public EmployeeModel findByName(String name);

        void deleteById(String id);
}