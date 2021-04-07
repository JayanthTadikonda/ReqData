package com.jay.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankServiceImpl implements BankAccountService {

   // BankAccountRepositoryImpl bankAccountRepository ;
   ApplicationContext context = new ClassPathXmlApplicationContext("banks.xml");
   BankAccountRepositoryImpl impl = (BankAccountRepositoryImpl) context.getBean("bankAccount");

    @Override
    public double withdraw(long accountId, double balance) {

        for (BankAccount b: impl.accounts) {
            if(b.getAccountId() == accountId){
                double bal = b.getAccountBalance() - balance;
                System.out.println("Remaining Balance after Withdrawal: " + bal);
            }
        }
        return 0;
    }

    @Override
    public double deposit(long accountId, double balance) {
        return 0;
    }

    @Override
    public double getBalance(long accountId) {
        double bal = 0.0;

       return 0;
    }

    @Override
    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
        return false;
    }
}
