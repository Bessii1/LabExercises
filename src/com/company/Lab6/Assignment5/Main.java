package com.company.Lab6.Assignment5;


import com.company.Lab4.Assignment1.SavingAccounts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        Lottery lottery = new Lottery();
        for (int i = 0; i <lottery.SIZE ; i++) {
            System.out.println("Enter the "+(i+1)+" number : ");
            input=sc.nextLine();
            lottery.setGuess(i,input);

        }
        lottery.generateLottaryNumbers();
        System.out.println("You were able to find "+lottery.matched()+"/5 numbers");
        System.out.println(lottery.winner());
    }
}
