package com.company.Lab8.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestScores extends IllegalArgumentException{

    ArrayList<Integer> array = new ArrayList<>();

    public TestScores(ArrayList<Integer> array) {
        this.array = array;
        for (int i = 0; i < this.array.size(); i++) {
            if (this.array.get(i) > 100 || this.array.get(i) < 0 ){
                throw new IllegalArgumentException("The scores cannot be greater than 100 or less than 0");
            }
        }
    }
    public double average(){
        double totalscore=0;
        for (int i = 0; i < this.array.size() ; i++) {
            totalscore += this.array.get(i);
        }
        return totalscore/ this.array.size();
    }
}
class Main{
    public static void main(String[] args) {
        //this for testing the message for illegal argument
//        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(20,30,40,50,60,70,-10));
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(20,30,40,50,60,70,10));
        TestScores testScores =new TestScores(array);


    }
}
