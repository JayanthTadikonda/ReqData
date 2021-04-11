package com.jay.SpringMongoRest;

import com.jay.SpringMongoRest.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
//@ComponentScan(basePackages = {"com.jay.SpringMongoRest"})
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class SpringMongoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoRestApplication.class, args);
	}

}
