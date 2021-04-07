package com.jay.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BankServiceImpl implements BankAccountService{

    List<BankAccount> accounts;

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public double withdraw(long accountId, double balance) {

//        for (BankAccount b: impl.accounts) {
//            if(b.getAccountId() == accountId){
//                double bal = b.getAccountBalance() - balance;
//                System.out.println("Remaining Balance after Withdrawal: " + bal);
//            }
        //}
        return 0;
    }

    @Override
    public double deposit(long accountId, double balance) {
        return 0;
    }

    @Override
    public double getBalance(long accountId) {
        System.out.println("Calling getBalance from service IMPL");
        for (BankAccount b: accounts) {
            if(b.getAccountId()==accountId){
                int index = accounts.indexOf(b);
                System.out.println("Bal: "+ accounts.get(index).getAccountBalance());
            }
        };
        //System.out.println("Balance: " + a);

       return 0;
    }

    @Override
    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {

        return false;
    }

}
