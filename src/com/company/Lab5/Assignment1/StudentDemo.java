package com.company.Lab5.Assignment1;


public class StudentDemo {

    public static void main(String[] args) {

        Student array[] = {new UndergraduateStudent(17070085, "Egzon"), new GraduateStudents(170700856, "Besian")
                , new StudentAtLarge(17070087, "Art"), new UndergraduateStudent(17070088, "Leonit"),
                new GraduateStudents(17070089, "Fatlum"), new StudentAtLarge(17070090, "Florian")};

        for (Student x : array) {
            System.out.println(x);
        }

    }
}
