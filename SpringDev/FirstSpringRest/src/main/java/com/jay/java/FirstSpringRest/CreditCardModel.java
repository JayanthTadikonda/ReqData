package com.jay.java.FirstSpringRest;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreditCardModel {

    //@Pattern(regexp = "^/[601][10]-[0-9]/{16}",message = "Starting with 601100 ONLY ! ")
    //@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")
    @Size(min = 16 ,message = "Minimum length 16 Enter 16 digits!!!")
    private long number;

    @NotBlank(message = "Enter Credit Card Name !")
    private String name;

    public CreditCardModel(long number, String name) {
        this.number = number;
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreditCardModel{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
