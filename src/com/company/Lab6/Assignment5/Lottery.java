package com.company.Lab6.Assignment5;

import java.util.Arrays;

public class Lottery {
    public final int SIZE = 5;
    private String numbersYoufound;
    private String lotary[]=new String[SIZE];
    private String guess[]=new String[SIZE];

    public void generateLottaryNumbers(){
        for (int i = 0; i < SIZE; i++) {
            int randomNumber = (int)(Math.random()*10);
            lotary[i]=randomNumber+"";
        }
    }

    public String[] getLotary() {
        return lotary;
    }
    public String[] getGuess() {
        return guess;
    }

    public void setGuess(int i , String guess) {
        this.guess[i] = guess;
    }

    public int matched(){
        int match=0;
        for (int i = 0; i < SIZE; i++) {
            if (lotary[i].equals(guess[i])){
                match++;
                numbersYoufound += "\nYou found the number:"+guess[i];
            }else{
                numbersYoufound += "\nYou did not found the number:"+guess[i];
            }
        }
        return match;
    }
    public String winner(){
        if(matched()==5){
            return "You are a Winner";
        }else{
            return "Better luck next time";
        }
    }

    @Override
    public String toString() {
        return "Lottery{" +
                ", lotary=" + Arrays.toString(lotary) +
                ", guess=" + Arrays.toString(guess) +
                '}';
    }
}
