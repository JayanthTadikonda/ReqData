package com.tadikonda;

public class Main {

    public static void main(String[] args) {

        Customer John = new Customer("John",88888888,4569778,"savings" );

        John.depositMoney(500);
        John.withdraw(250);
        System.out.println(John.getCustomerName());

        VipCustomer Luke = new VipCustomer("Luke Parkor", "Luke@gmail.com");
        System.out.println(Luke.getCustomerName());
        System.out.println(Luke.getCreditLimit());
    }
}