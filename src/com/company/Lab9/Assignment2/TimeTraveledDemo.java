package com.company.Lab9.Assignment2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeTraveledDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of vehicle speed in miles per hour : ");
        double milesPerhours = sc.nextDouble();
        if(milesPerhours < 0 ){
            throw new InputMismatchException("Miles should be greater than 0");
        }
        System.out.println("Enter the number of time that u traveled: ");
        int time = sc.nextInt();
        if (time < 1 ){
            throw new InputMismatchException("Time should be greater than 1 and a integer value");
        }
        File file = new File("Raport");
        FileWriter writeFile =new FileWriter(file);
        writeFile.write("Hour\t"+"Distance Traveled");
        writeFile.write("\n--------------------------");

        for (int i = 0; i < time; i++) {
            writeFile.write("\n");
            writeFile.write((i+1)+"\t\t\t"+(milesPerhours*(i+1)));
        }
        writeFile.close();
    }
}
