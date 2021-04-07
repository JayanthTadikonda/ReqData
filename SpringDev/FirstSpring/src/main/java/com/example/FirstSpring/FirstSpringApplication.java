package com.example.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		Hello obj = (Hello) context.getBean("hello");
		obj.hello();
	}
}
