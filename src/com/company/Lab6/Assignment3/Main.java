package com.company.Lab6.Assignment3;


import com.company.Lab4.Assignment1.SavingAccounts;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String answer;
        Scanner sc = new Scanner(System.in);
        DriverExam driverExam =new DriverExam();

            for (int i = 0; i < driverExam.size; i++) {
                System.out.println("Enter the answer for the " + (i + 1) + " question : ");
                answer = sc.nextLine();
                while (!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D"))) {
                    System.out.println("Your answer should be A , B,C,or D : ");
                    answer = sc.nextLine();
                }
                driverExam.setStudentAnswers(i, answer);
            }

        System.out.print("You have "+driverExam.totalCorrectAnswers()+ " correct answers");
        System.out.print("\nYou have "+driverExam.totalWrongAnswers()+ " wrong answers");
//        System.out.println("You have mised total of "+ Arrays.toString(driverExam.questionMissed())+" questions");
        if (driverExam.passed()){
            System.out.println("Congrats you have passed the exam ");
        }else{
            System.out.println("Sorry try it next time");
        }
        sc.close();
    }
}
