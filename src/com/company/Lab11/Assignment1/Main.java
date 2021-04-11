package com.company.Lab11.Assignment1;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String input = sc.nextLine();

        SortedSet<String> uniqueWords = new TreeSet<>();
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            uniqueWords.add(token);
        }
        System.out.println("The unique words are : ");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

    }
}
