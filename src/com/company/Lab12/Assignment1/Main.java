package com.company.Lab12.Assignment1;

public class Main {
    public static void main(String[] args) {

        EmployeeMapClass employeeMapClass = new EmployeeMapClass();
        Employee[] employees = {
                new Employee("123", "Jackson"),
                new Employee("543", "John"),
                new Employee("543", "Mary")
        };
        for (Employee employee : employees) {
            employeeMapClass.add(employee);
        }
        Employee employee = employeeMapClass.get("123");
        if (employee == null) {
            System.out.println("Employee Not found");
        } else {
            System.out.println(employee);
        }
    }
}
