package com.company.Lab2.Assignment6;

public class Payroll {
    private String name;
    private int ID;
    private double hourlyPayRate;
    private double hours;

    public Payroll(String name, int ID) {
        this.name=name;
        this.ID=ID;
        this.hourlyPayRate = 0.0;
        this.hours= 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public double grossPay() {
        return this.hourlyPayRate * this.hours;
    }
}
