package com.company.Lab3.Assignment3;

import com.company.Lab3.Assignment2.Employee;

import java.util.Date;

public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualProduction;

    public ShiftSupervisor(String name, Date hireDate, double annualSalary, double annualProduction) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
        this.annualProduction = annualProduction;
    }

    public ShiftSupervisor(String name, double annualSalary, double annualProduction) {
        super(name);
        this.annualSalary = annualSalary;
        this.annualProduction = annualProduction;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProduction() {
        return annualProduction;
    }

    public void setAnnualProduction(double annualProduction) {
        this.annualProduction = annualProduction;
    }

    @Override
    public String toString() {
        return "ShiftSupervisor{" + super.toString() +
                "annualSalary=" + annualSalary +
                ", annualProduction=" + annualProduction +
                '}';
    }
}
