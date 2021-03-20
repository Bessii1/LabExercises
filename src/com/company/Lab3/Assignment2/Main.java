package com.company.Lab3.Assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Employe : ");
        String name = sc.next();
        System.out.print("\nEnter the shift (1/2): ");
        int shift = sc.nextInt();
        System.out.print("\nEnter the hourly pay rate : ");
        double hourlyPayRate = sc.nextDouble();

        ProductionWorker productionWorker = new ProductionWorker(name, shift, hourlyPayRate);
        System.out.println(productionWorker.toString());
        sc.close();
    }

}
