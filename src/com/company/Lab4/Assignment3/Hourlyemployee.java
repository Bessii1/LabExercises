package com.company.Lab4.Assignment3;

public class Hourlyemployee extends Employee{
    private int hourlyWorked;
    private double hourSalary;
    private double salary;

    public Hourlyemployee(int hourlyWorked, double hourSalary) {
        this.hourlyWorked = hourlyWorkedd();
        this.hourSalary = 0;
        this.salary = salary();
    }
    public int hourlyWorkedd(){
        if(hourlyWorked>40){
            hourlyWorked += hourlyWorked/2;
        }
        return hourlyWorked;
    }
    public double salary(){
        this.salary=hourlyWorked*hourSalary;
        return this.salary;
    }
}
