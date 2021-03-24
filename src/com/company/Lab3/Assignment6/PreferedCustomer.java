package com.company.Lab3.Assignment6;

import com.company.Lab3.Assignment5.Customer;

public class PreferedCustomer extends Customer {
    private double amountPurchases;
    private double discount;

    public PreferedCustomer(String name, String addres, String telephone,
                            int customerNumber, boolean wishToBeInList, double amountPurchases) {
        super(name, addres, telephone, customerNumber, wishToBeInList);
        this.amountPurchases = amountPurchases;
        this.discount = discount;
    }

    public double getAmountPurchases() {
        return amountPurchases;
    }

    public void setAmountPurchases(double amountPurchases) {
        this.amountPurchases = amountPurchases;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double discountPercentage(){
        if (amountPurchases >=500 && amountPurchases <1000){
            discount = 0.05;
        }
        else if (amountPurchases >=1000 && amountPurchases <1500){
            discount = 0.06;
        }
        else if (amountPurchases >=1500 && amountPurchases <2000){
            discount = 0.07;
        }
        else if (amountPurchases > 2000){
            discount = 0.10;
        }
        else{
            discount=0;
        }
        return discount;
    }
    public double amountToPay(){
        return amountPurchases*discount;
    }

    @Override
    public String toString() {
        return super.toString()+"PreferedCustomer{" +
                "amountPurchases=" + amountPurchases +
                ", discount=" + discount +
                "the amount to pay is : "+amountToPay()+
                '}';
    }
}
