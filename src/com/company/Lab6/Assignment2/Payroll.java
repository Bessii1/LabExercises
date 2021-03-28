package com.company.Lab6.Assignment2;

import java.util.Arrays;

public class Payroll {
    public final int LENGTH = 2;
    private int [] employeeId = {5658845 ,4520125};
    // ,7895122 ,8777541 ,8451277 ,1302850 ,7580489
    private double hours[]=new double[LENGTH];
    private double payRate[]=new double[LENGTH];
    private double wages[]=new double[LENGTH];

    public int getEmployeeId(int i) {
        return employeeId[i];
    }

    public void setEmployeeId(int i,int employeeId) {
        this.employeeId[i] = employeeId;
    }

    public double getHours(int i) {
        return hours[i];
    }

    public void setHours(int i , double hours) {
        this.hours[i] = hours;
    }

    public double getPayRate(int i) {
        return payRate[i];
    }

    public void setPayRate(int i , double payRate) {
        this.payRate[i] = payRate;
    }

    public double getWages(int i) {
        return wages[i];
    }

    public void setWages(int i ,double wages) {
        this.wages[i] = wages;
    }
    public double grossPay(int ID){
        double grossPay = 0.0;
        for (int j = 0; j < employeeId.length; j++) {
            if (employeeId[j]==ID){
                 grossPay = hours[j]*payRate[j];
                 break;
            }else{
                continue;
            }
        }
        return grossPay;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "LENGTH=" + LENGTH +
                ", employeeId=" + Arrays.toString(employeeId) +
                ", hours=" + Arrays.toString(hours) +
                ", payRate=" + Arrays.toString(payRate) +
                ", wages=" + Arrays.toString(wages) +
                '}';
    }


}
