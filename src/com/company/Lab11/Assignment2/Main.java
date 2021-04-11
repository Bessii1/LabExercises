package com.company.Lab11.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> primeList = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < 10) {
            if (isPrime(number)) {
                primeList.add(number);
                count++;
            }
            number++;
        }
        ListIterator<Integer> iterator = primeList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static boolean isPrime(int number) {
        boolean flag = true;
        int div = 2;
        while (div < number) {
            if (number % div == 0) {
                flag = false;
                break;
            }
            div++;
        }
        return flag;
    }
}
