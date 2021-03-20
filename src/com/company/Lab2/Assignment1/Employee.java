package com.company.Lab2.Assignment1;

public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String postion;


    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.postion = "";
    }

    public Employee(String name, int idNumber, String department, String postion) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.postion = postion;
    }

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.postion = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }
}
