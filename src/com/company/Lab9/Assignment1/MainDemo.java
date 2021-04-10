package com.company.Lab9.Assignment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name for the first file  : ");
        String firstFile = sc.nextLine();
        System.out.println("Enter the content of the first file  : ");
        String content = sc.nextLine();

        PrintWriter writeToFirstFile = new PrintWriter(new File(firstFile));
        writeToFirstFile.print(content);

        System.out.println("Enter the name for the second file  : ");
        String secondFile = sc.nextLine();
        System.out.println();

        sc = new Scanner(firstFile);
        System.out.println();
        String content1 = "";
        while (sc.hasNext()){
            content1 =sc.next();
        }
        content1 = content1.trim().toUpperCase();

        FileWriter writeToSecondFile = new FileWriter(new File(secondFile));
        writeToSecondFile.write(content1);


        writeToFirstFile.close();
        writeToSecondFile.close();
        sc.close();

    }
}
