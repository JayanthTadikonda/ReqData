package com.jay.java;

public class Customer {

    private String customerName;
    private int customerId;
    private Address customerAddress;
    private int customerContact;

    public Customer() {

    }

    public Customer(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Customer(String customerName, int customerId, Address customerAddress, int customerContact) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(int customerContact) {
        this.customerContact = customerContact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", customerAddress=" + customerAddress +
                ", customerContact=" + customerContact +
                '}';
    }
}
