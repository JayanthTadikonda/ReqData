package com.jay.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

//    @Autowired
//    static
//    BankAccountRepositoryImpl bankAccountRepository;
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("banks.xml");
        BankAccountRepository bankAccountRepository = (BankAccountRepository) context.getBean("bankAccountRepositoryImpl");
        //BankServiceImpl service = (BankServiceImpl) context.getBean("serviceAcc");
        BankAccountController controller = (BankAccountController) context.getBean("bankAccountController");

        //System.out.println(bankAccountRepository.getAccounts().toString());

        //service.getBalance(111);

        bankAccountRepository.getBalance(111);
        bankAccountRepository.updateBalance(111,110);

        //service.getBalance(111);

        bankAccountRepository.getBalance(111);

       // controller.bankAccountService.withdraw(111,123);

        controller.withdraw(111,2000);

    }
}
