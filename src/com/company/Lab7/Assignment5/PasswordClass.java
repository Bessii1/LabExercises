package com.company.Lab7.Assignment5;

import java.util.Scanner;

public class PasswordClass {

    private String password;

    public PasswordClass(String password) {
        this.password = password;
    }

    public boolean lengthOfPassword() {
        if (this.password.length() >= 6)
            return true;
        else
            return false;
    }

    public boolean checkingForUpperCaseLetter() {
        boolean value = true;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                value = true;
                break;
            } else
                value = false;
        }
        return value;
    }

    public boolean checkingForLowerCaseLetter() {
        boolean value = true;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                value = true;
                break;
            } else
                value = false;
        }
        return value;
    }

    public boolean checkingForDigit() {
        boolean value = true;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                value = true;
                break;
            } else
                value = false;
        }
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password : ");
        String password = sc.nextLine();
        PasswordClass obj = new PasswordClass(password);


        if (obj.lengthOfPassword()) {
            System.out.println("Your Pasword is in a proper length");
        } else {
            System.out.println("Your password should be at list 6 characters long");
        }

        if (obj.checkingForUpperCaseLetter()) {
            System.out.println("Your Pasword it does contain a upperCaseLetter");
        } else {
            System.out.println("Your Pasword should at least contain a upperCaseLetter");
        }
        if (obj.checkingForLowerCaseLetter()) {
            System.out.println("Your Pasword it does contain a loweCaseLetter");
        } else {
            System.out.println("Your Pasword should at least contain a lowerCaseLetter");
        }

        if (obj.checkingForDigit()) {
            System.out.println("Your Pasword it does contain a digit");
        } else {
            System.out.println("Your Pasword should at least contain a digit");
        }

        if (obj.lengthOfPassword() & obj.checkingForDigit() & obj.checkingForLowerCaseLetter() & obj.checkingForUpperCaseLetter()) {
            System.out.println("Your password matches the requirements");
        } else
            System.out.println("Please mathc the requirements");
    }


}