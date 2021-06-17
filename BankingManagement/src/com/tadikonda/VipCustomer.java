package com.tadikonda;

public class VipCustomer {
    private String customerName;
    private String email;
    private int creditLimit;

    public VipCustomer() {
        this("DefaultName", "123@mail.com", 99999);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String customerName, String email) {
        this(customerName,email,99999);

    }

    public VipCustomer(String customerName, String email, int creditLimit) {
        this.customerName = customerName;
        this.email = email;
        this.creditLimit = creditLimit;
    }
}
