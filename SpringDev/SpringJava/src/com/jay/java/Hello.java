package com.jay.java;

public class Hello {
    private String message;
    private String message2;
    private int number;

    public Hello(String message, int number){
        this.number = number;
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Hello(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public String getMessage2() {
        return message2;
    }


    public void setMessage(String message) {
        this.message = message;
    }
    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void hello(){
        System.out.println(getMessage()+" Hello "+ getMessage2());
    }
}