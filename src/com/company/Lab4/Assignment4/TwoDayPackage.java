package com.company.Lab4.Assignment4;

public class TwoDayPackage extends Package{
    private double flatFlee;

    public TwoDayPackage(String name, String address, String city, String state, String zipCode, String recipient, double weight, double cost, double flatFlee) {
        super(name, address, city, state, zipCode, recipient, weight, cost);
        this.flatFlee = flatFlee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+flatFlee;
    }
}
