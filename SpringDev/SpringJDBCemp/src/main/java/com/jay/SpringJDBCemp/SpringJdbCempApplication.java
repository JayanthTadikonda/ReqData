package com.jay.SpringJDBCemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
public class SpringJdbCempApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbCempApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeJdbcTemplate jdbcTemplate = (EmployeeJdbcTemplate) context.getBean("empDAO");

//		jdbcTemplate.createEmployee(new EmployeeModel(1,"jack",22,"se",123,"tj"));
//		System.out.println("Created Rows: ");

		//jdbcTemplate.createEmployeeNamed(new EmployeeModel(2,"Kevin",25,"se",125,"tj"));

		jdbcTemplate.getAllEmployees();
	}


}
