package com.jay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jay"})
public class SpringDataCrudRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	}

}
