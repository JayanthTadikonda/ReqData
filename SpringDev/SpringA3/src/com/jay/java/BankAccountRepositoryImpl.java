package com.jay.java;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class BankAccountRepositoryImpl implements BankAccountRepository, ApplicationContextAware {

    ApplicationContext applicationContext;
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
                    System.out.println("Getting BALANCE from Repo");
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
                System.out.println("Updated Bal at Repo: "+ accounts.get(index).getAccountBalance());
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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
