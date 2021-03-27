package com.company;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable ");
            }
        };

        new Thread(runnable).start();

        Runnable runnable1 = ()-> {
            System.out.println("Inside runnable 1");
            System.out.println("Testing lambda Usage.");
        };
        runnable1.run();

        new Thread(runnable1).start();

        new Thread(()-> System.out.println("Inside runnable 3")).start();



        }
    }