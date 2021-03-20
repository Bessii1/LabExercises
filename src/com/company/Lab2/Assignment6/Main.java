package com.company.Lab2.Assignment6;

import com.company.Lab2.Assignment1.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Test of the Temperature Class\n");

        Payroll objP=new Payroll("Besian",12345678);
        objP.setHourlyPayRate(10);
        objP.setHours(76.5);
        System.out.println("Enter the employee name : ");
        String name = sc.next();

        if (objP.getName().equals(name)){
            System.out.println("The amount of gross pay earned is : "+objP.grossPay());
        }
        else {
            System.out.println("The employee with name "+name+" does not exists");
        }
        sc.close();
    }
}
