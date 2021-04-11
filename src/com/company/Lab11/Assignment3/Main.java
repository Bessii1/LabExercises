package com.company.Lab11.Assignment3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Instructor> instructorsSet = new HashSet<>();
        instructorsSet.add(new Instructor("John", "Williams", "A123"));
        instructorsSet.add(new Instructor("Alan", "Kramers", "D123"));
        instructorsSet.add(new Instructor("Bob", "Williamson", "c123"));
        instructorsSet.add(new Instructor("John", "Williams", "A123"));

        for (Instructor instructor : instructorsSet) {
            System.out.println(instructor);
        }

    }
}
