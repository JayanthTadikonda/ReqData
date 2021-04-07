package com.jay.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("banks.xml");
        BankAccountRepository bankAccountRepository = (BankAccountRepository) context.getBean("bankAccount");
        BankServiceImpl service = (BankServiceImpl) context.getBean("serviceAcc");
        BankAccountService bankAccountService = (BankAccountService) context.getBean("serve");

       // System.out.println(bankAccountRepository.getAccounts().toString());

        service.getBalance(111);

        bankAccountRepository.getBalance(111);
        bankAccountRepository.updateBalance(111,110);

        service.getBalance(111);
        bankAccountRepository.getBalance(111);



    }
}
