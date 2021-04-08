package com.jay.java;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BankAccountRepository {

    public double getBalance(long accountId);
    public double updateBalance(long accountId, double newBalance);

}
