package com.jay.java;

import java.util.List;

public interface BankAccountRepository {

    public double getBalance(long accountId);
    public double updateBalance(long accountId, double newBalance);
}
