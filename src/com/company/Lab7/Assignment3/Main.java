package com.company.Lab7.Assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String : ");
        try{
            String input = sc.nextLine();
            System.out.println("The string contains "+numberOfWords(input)+" words");
        }catch(Exception e){
            System.out.println("Please enter a string .... ");
        }
    }
    public static int numberOfWords(String input){
        String array[] =input.split(" ");
        return array.length;
    }
}
