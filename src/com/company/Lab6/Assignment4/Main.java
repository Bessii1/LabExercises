package com.company.Lab6.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc =new Scanner(System.in);
        String name;
        double array[][]=new double[student.SIZEOFSTUDENTS][student.SIZEOFTEST];
        double input;
        for (int i = 0; i <student.SIZEOFSTUDENTS ; i++) {
            System.out.println("Enter the name of the "+(i+1)+" student : ");
            name = sc.next();
            student.setStudentNames(i,name);
            System.out.println("Enter the scores to student named " +name+" : ");
            for (int j = 0; j <student.SIZEOFTEST ; j++) {
                input = sc.nextDouble();
                while(input > 100 || input < 0 ){
                    System.out.println("Please enter a score between 1 and 100 : ");
                    input = sc.nextDouble();
                }
                array[i][j]=input;
            }
        }
        student.setScoreOfStudent1(array[0]);
        student.setScoreOfStudent2(array[1]);
        student.setScoreOfStudent3(array[2]);
        student.setScoreOfStudent4(array[3]);
        student.setScoreOfStudent5(array[4]);

        for (int i = 0; i < student.SIZEOFSTUDENTS; i++) {
            System.out.println("The student named "+student.getStudentName(i)+" has an average score of : "+
                    +student.average(array[i])+" and has a latter grade : "+student.letterGrade(student.average(array[i])));
        }

    }

}
