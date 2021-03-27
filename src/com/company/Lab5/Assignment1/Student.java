package com.company.Lab5.Assignment1;

public abstract class Student {
    private int studentID;
    private String name;
    private String lasName;
    private double annualTuition;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public double getAnnualTuition() {
        return annualTuition;
    }

    public abstract void setAnnualTuition(double annualTuition);

    @Override
    public String toString() {
        return "Student : " +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", lasName='" + lasName+" ";
    }
}
