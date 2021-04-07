package com.jay.java;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Car {

    private int doors;
    private int wheels;

    public Car(int doors, int wheels) {
        this.doors = doors;
        this.wheels = wheels;
    }

    public Car() {
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "com.jay.java.Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                '}';
    }
}
