package com.company.Lab2.Assignment1;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println("Name" + "\t\t\tID Number" + "\tDepartment" + "\t\tPostion");
        System.out.println("------------------------------------------------------");
        System.out.println(employee1.getName() + "\t" + employee1.getIdNumber() + "\t\t" + employee1.getDepartment() + "\t\t" + employee1.getPostion());
        System.out.println(employee2.getName() + "\t\t" + employee2.getIdNumber() + "\t\t" + employee2.getDepartment() + "\t\t\t\t" + employee2.getPostion());
        System.out.println(employee3.getName() + "\t\t" + employee3.getIdNumber() + "\t\t" + employee3.getDepartment() + "\t" + employee3.getPostion());
    }
}
