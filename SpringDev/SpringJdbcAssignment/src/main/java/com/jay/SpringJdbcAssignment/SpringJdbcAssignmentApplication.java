package com.jay.SpringJdbcAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringJdbcAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcAssignmentApplication.class, args);

		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		StudentDao dao = (StudentDao) ctx.getBean("studentJDBCTemplate");

		//dao.create("jack",25,1);
		//dao.create("Randall",35,2);
		//dao.create("Kevin",65,3);

		dao.getStudent(0);

		dao.listAll();
	}

}
