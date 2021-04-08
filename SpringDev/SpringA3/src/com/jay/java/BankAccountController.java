package com.jay.java;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BankAccountController implements ApplicationContextAware {
    ApplicationContext context = null;

    public double withdraw(long accountId, double balance){
        BankAccountRepositoryImpl impl = (BankAccountRepositoryImpl) context.getBean("bankAccount");
        double bal = impl.updateBalance(accountId,-balance);
//        bal -= balance;
//        System.out.println("After Withdrawal: " + getBalance(accountId));
        return bal;
    }

    public double deposit(long accountId, double balance){
        return balance;
    }

   public double getBalance(long accountId){
       System.out.println("Calling From CONTROLLER ");
        BankAccountRepositoryImpl impl = (BankAccountRepositoryImpl) context.getBean("bankAccount");
        double bal = impl.getBalance(accountId);
        //System.out.println(impl.getBalance(accountId));
        return bal;
    }

    public boolean fundTransfer(long fromAccount, long toAccount, double amount){
        return false;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
