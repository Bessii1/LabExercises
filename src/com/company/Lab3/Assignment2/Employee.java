package com.company.Lab3.Assignment2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    public String name;
    public String employeeNumber;
    public Date hireDate;

    public Employee(String name, String employeeNumber, Date hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public Employee(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
        this.employeeNumber = generateEmployeeNumber();
    }

    public Employee(String name) {
        this.name = name;
//        this.hireDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.hireDate = new Date();
        this.employeeNumber = generateEmployeeNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String generateEmployeeNumber() {
        String generatedNumber = "";
        for (int i = 0; i < 4; i++) {
            int randomNumber = (int) (Math.random() * 10);
            generatedNumber += randomNumber;
        }
        char generatedChar = (char) (int) ((Math.random() * (91 - 65)) + 65);
        generatedNumber += generatedChar;
        return generatedNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
