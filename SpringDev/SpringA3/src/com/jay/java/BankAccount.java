package com.jay.java;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccount {

    private long accountId;
    private String accountHolderName;
    private String accountType;
    private double accountBalance;

    public BankAccount(int accountId, String accountHolderName, String accountType, double accountBalance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public BankAccount() {
    }

    public long getAccountId() {
        return accountId;
    }
    @Autowired
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "com.jay.java.BankAccount{" +
                "accountId=" + accountId +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
