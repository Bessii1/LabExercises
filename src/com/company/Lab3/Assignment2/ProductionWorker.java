package com.company.Lab3.Assignment2;

import java.util.Date;

public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String name, String employeeNumber, Date hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public ProductionWorker(String name, Date hireDate, int shift, double hourlyPayRate) {
        super(name, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public ProductionWorker(String name, int shift, double hourlyPayRate) {
        super(name);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return this.shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public String getShiftTurn() {
        String shiftName = "";
        if (this.shift == 1) {
            shiftName = "Day";
        } else if (this.shift == 2) {
            shiftName = "Night";
        } else {
            shiftName = "This shift does not exists";
        }
        return shiftName;
    }

    @Override
    public String toString() {
        return "ProductionWorker{" + super.toString() +
                ", Shift=" + getShiftTurn() +
                ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }
}
