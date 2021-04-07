package com.jay.java;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository {


    public List<BankAccount> accounts;

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public double getBalance(long accountId) {
            for (BankAccount b: accounts) {
                if(b.getAccountId()==accountId){
                    int index = accounts.indexOf(b);
                    System.out.println("Bal: "+ accounts.get(index).getAccountBalance());
                }
            };
      return 0;
    }

    @Override
    public double updateBalance(long accountId, double newBalance) {
        for (BankAccount b: accounts) {
            if(b.getAccountId()==accountId){
                int index = accounts.indexOf(b);
                double bal = b.getAccountBalance()+newBalance;
                b.setAccountBalance(bal);
                System.out.println("Updated Bal: "+ accounts.get(index).getAccountBalance());
            }
        };
        return 0;
    }

    @Override
    public String toString() {
        return "BankAccountRepositoryImpl{" +
                "accounts=" + accounts +
                '}';
    }
}
