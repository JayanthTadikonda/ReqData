package com.tadikonda;

public class Customer {
    private String customerName;
    private int phoneNo;
    private int accountNumber;
    private String accType;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Customer() {
        System.out.println("The default Constructor call !");
    }

    public Customer(String customerName, int phoneNo, int accountNumber, String accType) {
        System.out.println("Parameterized Constructor Call !");
        this.customerName = customerName;
        this.phoneNo = phoneNo;
        this.accountNumber = accountNumber;
        this.accType = accType;
    }

    public void depositMoney(int money) {
        balance += money;
        System.out.println("Amount deposited, Total available balance: " + balance);
    }

    public void withdraw(int amount) {
        if(balance - amount <= 0) {
            System.out.println("Sorry!, Insufficient Funds.");
        }
        else {
            balance -= amount;
            System.out.println("Amount withdrawn : " + amount + " Remaining Balance : " + balance);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}
