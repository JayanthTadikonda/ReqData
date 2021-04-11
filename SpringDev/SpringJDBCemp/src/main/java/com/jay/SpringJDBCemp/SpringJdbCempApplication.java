package com.jay.SpringJDBCemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
public class SpringJdbCempApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbCempApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeJdbcTemplate jdbcTemplate = (EmployeeJdbcTemplate) context.getBean("empDAO");
		 EmployeeAdditional emp = (EmployeeAdditional) context.getBean("emp2");

//		jdbcTemplate.createEmployee(new EmployeeModel(1,"jack",22,"se",123,"tj"));
//		System.out.println("Created Rows: ");

		//jdbcTemplate.createEmployeeNamed(new EmployeeModel(2,"Kevin",25,"se",125,"tj"));


		jdbcTemplate.getAllEmployees();
		jdbcTemplate.getByRowMapper();
		//jdbcTemplate.getEmp(2);
		//List<EmployeeModel> e =  jdbcTemplate.getByResultSet();
		//System.out.println(e.listIterator().next().toString());
		//System.out.println("Count:"+jdbcTemplate.rowCount());
		//emp.insert(new EmployeeModel(3,"Sophie",26,"se",123,"tj"));
		//jdbcTemplate.getByRowMapper();
		//emp.call(3);
		//emp.callall();
		//jdbcTemplate.updateEmployee("kate", 2);
		//jdbcTemplate.updateEmployeeByArray("Becaa",123);
		jdbcTemplate.insertSimple(new EmployeeModel(4,"Salone",23,"ux",14,"tj"));
	}


}
