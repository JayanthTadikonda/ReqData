package com.jay.SpringMongoRest.repository;

import com.jay.SpringMongoRest.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface UserRepository extends MongoRepository<User, Integer> {


}
