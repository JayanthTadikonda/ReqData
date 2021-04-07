package com.jay.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class AnnotationsDemo {
    @Autowired
    @Qualifier("parts")
    private Car parts;

    public Car getParts() {
        return parts;
    }

    public void setParts(Car parts) {
        this.parts = parts;
    }

    public void carDoors(){
        System.out.println("This is a "+parts.getDoors() + " car");
    }

    public void carWheels(){
        System.out.println("This is a "+parts.getWheels() + " car");
    }

    @Override
    public String toString() {
        return "AnnotationsDemo{" +
                "parts=" + parts +
                '}';
    }
}
