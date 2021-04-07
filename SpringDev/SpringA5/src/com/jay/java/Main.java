package com.jay.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("cars.xml");
        AnnotationsDemo annotationsDemo = (AnnotationsDemo) context.getBean("annotationsDemo");

        System.out.println(annotationsDemo.toString());


    }
}
