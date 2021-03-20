package com.company.Lab3.Assignment5;

public class Customer extends Person {
    private int customerNumber;
    private boolean wishToBeInList;

    public Customer(String name, String addres, String telephone, int customerNumber, boolean wishToBeInList) {
        super(name, addres, telephone);
        this.customerNumber = customerNumber;
        this.wishToBeInList = wishToBeInList;
    }

    public Customer(String name, String addres, String telephone, int customerNumber) {
        super(name, addres, telephone);
        this.customerNumber = customerNumber;
        this.wishToBeInList = true;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isWishToBeInList() {
        return wishToBeInList;
    }

    public void setWishToBeInList(boolean wishToBeInList) {
        this.wishToBeInList = wishToBeInList;
    }
}
