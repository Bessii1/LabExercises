package com.company.Lab4.Assignment4;

public class OvernightPackage extends Package{
    private double flatFee;

    public OvernightPackage(String name, String address, String city, String state, String zipCode, String recipient, double weight, double cost, double flatFee) {
        super(name, address, city, state, zipCode, recipient, weight, cost);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return (super.getCost()+flatFee)*super.getWeight();
    }
}
