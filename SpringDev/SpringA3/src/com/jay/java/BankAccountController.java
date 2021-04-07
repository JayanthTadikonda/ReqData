package com.jay.java;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BankAccountController implements ApplicationContextAware {
    ApplicationContext context = null;

    public double withdraw(long accountId, double balance){
        return balance;
    }

    public double deposit(long accountId, double balance){
        return balance;
    }

   /* public double getBalance(long accountId){
        BankServiceImpl impl = (BankServiceImpl) context.getBean("serve");
        System.out.println(impl.getBalance(accountId));
        return 0;
    }*/

    public boolean fundTransfer(long fromAccount, long toAccount, double amount){
        return false;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
