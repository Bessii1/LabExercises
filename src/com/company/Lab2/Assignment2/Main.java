package com.company.Lab2.Assignment2;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n");
        System.out.println("Test of the Car Class\n");

        Car objC1 = new Car(2017, "Besian");
        objC1.Accelerate();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Accelerate();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Accelerate();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Accelerate();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Accelerate();
        System.out.println("The current speed is " + objC1.getSpeed());

        objC1.Brake();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Brake();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Brake();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Brake();
        System.out.println("The current speed is " + objC1.getSpeed());
        objC1.Brake();
        System.out.println("The current speed is " + objC1.getSpeed());

    }
}
