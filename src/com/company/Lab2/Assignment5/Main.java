package com.company.Lab2.Assignment5;

import com.company.Lab2.Assignment1.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Test of the Temperature Class\n");

        try {
            System.out.println("Enter temperature on Farenhit: ");
            double temp = sc.nextDouble();

            Temperature objT = new Temperature(temp);
            System.out.println(objT.getFahrenheit());
            System.out.println("The temperature in Celcius is " + objT.getCelsius() + "\nThe temperature in Kelvin is " + objT.getKelvin());
        } catch (InputMismatchException e) {
            System.out.println("You should enter a number");
        }
        sc.close();
    }
}
