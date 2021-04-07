package com.jay.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringJava {

    public static void main(String[] args) {
      //  ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
        BeanFactory fac = new XmlBeanFactory(new FileSystemResource("hello.xml"));
        Hello obj = (Hello) fac.getBean("hello");
        obj.hello();
    }


}
