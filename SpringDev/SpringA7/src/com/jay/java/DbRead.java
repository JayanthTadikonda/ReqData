package com.jay.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DbRead {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DbProperties dbProperties = (DbProperties) context.getBean("dbc");
        System.out.println(dbProperties.toString());



    }
}
