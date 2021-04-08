package com.jay.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class BankAccountController{

    @Autowired
    BankAccountRepositoryImpl accounts;

    public double withdraw(long accountId, double balance){

        double bal = accounts.updateBalance(accountId,-balance);
        System.out.println("After Withdrawal: " + accounts.getBalance(accountId));
        return bal;
    }

    public double deposit(long accountId, double balance){
        return balance;
    }

//   public double getBalance(long accountId){
//       System.out.println("Calling From CONTROLLER ");
//        BankAccountRepositoryImpl impl = (BankAccountRepositoryImpl) context.getBean("bankAccount");
//        double bal = impl.getBalance(accountId);
//        //System.out.println(impl.getBalance(accountId));
//        return bal;
//    }

    public boolean fundTransfer(long fromAccount, long toAccount, double amount){
        return false;
    }
}
