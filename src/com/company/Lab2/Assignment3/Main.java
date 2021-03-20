package com.company.Lab2.Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Test of the Circle Class\n");

        try {
            System.out.println("Enter the circle Radius(number):");
            double radius = sc.nextDouble();

            Circle objCi1 = new Circle(radius);
            //reporting the circle’s area, diameter, and circumference.
            System.out.println("The area of the Circle is :" + objCi1.getArea() + "\nThe diameter of the Circle is : " + objCi1.getDiameter() + "\nThe Circumference of the Circle is :" + objCi1.getCircumference());


        } catch (InputMismatchException e) {
            System.out.println("You need to enter a number");
        }

    }
}
