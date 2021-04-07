package com.jay.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("banks.xml");
        BankAccountRepositoryImpl bankAccountRepository = (BankAccountRepositoryImpl) context.getBean("bankAccount");

        System.out.println(bankAccountRepository.getAccounts().toString());
        bankAccountRepository.getBalance(111);
        bankAccountRepository.updateBalance(111,100);

        BankServiceImpl bankService = (BankServiceImpl) context.getBean("bankAccountService");
        bankService.withdraw(111,500);

    }
}
