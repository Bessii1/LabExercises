package com.company.Lab7.Assignment4;

import java.util.Scanner;

public class ConsonantsVowels {
    private String input;

    public ConsonantsVowels(String input) {
        this.input = input;
    }

    public int countVowels() {
        int vCount = 0;
        for (int i = 0; i < this.input.length(); i++) {
            if (this.input.charAt(i) == 'a' || this.input.charAt(i) == 'e' || this.input.charAt(i) == 'i' || this.input.charAt(i) == 'o' || this.input.charAt(i) == 'u') {
                vCount++;
            }
        }
        return vCount;
    }

    public int countConsonants() {
        return this.input.length() - countVowels();
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String strInput = sc.nextLine();

        ConsonantsVowels obj = new ConsonantsVowels(strInput);

        boolean var = true;
        while (var) {
            System.out.println("What do u want to perform  : " +
                    "\na) Count the number of vowels in the string\n" +
                    "b) Count the number of consonants in the string\n" +
                    "c) Count both the vowels and consonants in the string\n" +
                    "d) Enter another string\n" +
                    "e) Exit the program\n" +
                    "Please enter one letter at time");
            String input = sc.next();
            input = input.toLowerCase();
            switch (input) {
                case "a":
                    System.out.println("The number of vowels is : " + obj.countVowels());
                    break;
                case "b":
                    System.out.println("The number of consonants is : " + obj.countConsonants());
                    break;
                case "c":
                    System.out.println("The number of vowels is : " + obj.countVowels() + "\n And the number of consonants is : " + obj.countConsonants());
                    break;
                case "d":
                    System.out.println("Enter another String : ");
                    strInput = sc.nextLine();
                    obj = new ConsonantsVowels(strInput);
                    break;
                case "e":
                    var = false;
                    break;
                default:
                    System.out.println("Please enter a letter betwen a - e ");
                    break;
            }
        }

    }
}
