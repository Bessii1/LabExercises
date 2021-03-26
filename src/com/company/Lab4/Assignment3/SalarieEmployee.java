package com.company.Lab4.Assignment3;

public class SalarieEmployee extends Employee{
    private double salary;

    public SalarieEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
