package com.company.Lab6.Assignment2;


import com.company.Lab4.Assignment1.SavingAccounts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double hours;
        double payRate;
        boolean booleanvalue = true;
        Scanner sc = new Scanner(System.in);
        Payroll payroll = new Payroll();
        for (int i = 0; i < payroll.LENGTH; i++) {

            System.out.println("Enter the employee hours and pay rate with ID : " + payroll.getEmployeeId(i)+" : ");
            hours = sc.nextDouble();
            payRate = sc.nextDouble();
            while (hours < 0 || payRate <6) {
                System.out.println("Errorr payrate need to be greater than 6 , and hours canot be negative ");
                hours = sc.nextDouble();
                payRate = sc.nextDouble();
            }
            payroll.setHours(i,hours);
            payroll.setPayRate(i,payRate);
        }
        for (int i = 0; i < payroll.LENGTH; i++) {
            System.out.println("The employee with Id " + payroll.getEmployeeId(i) + " has a gross pay of : " + payroll.grossPay(payroll.getEmployeeId(i)));
            payroll.setWages(i,payroll.grossPay(payroll.getEmployeeId(i)));
        }

    }
}
