package com.company.Lab4.Assignment3;

public class CommissionEmployee extends Employee{
    private double salesPercentage;
    private double baseSalary;
    private double generalSalary;

    public CommissionEmployee(double salesPercentage, double baseSalary) {
        this.salesPercentage = salesPercentage;
        this.baseSalary = baseSalary;
        this.generalSalary=salesPercentage*baseSalary;
    }

    public double getSalesPercentage() {
        return salesPercentage;
    }

    public void setSalesPercentage(double salesPercentage) {
        this.salesPercentage = salesPercentage;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
