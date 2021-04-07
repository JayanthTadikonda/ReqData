package com.jay.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("a2.xml");
        Question q = (Question) context.getBean("q3");

        System.out.println(q.toString());
    }
}
