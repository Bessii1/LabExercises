package com.company.Lab5.Assignment1;

public class UndergraduateStudent extends Student {
    private double tuition;

    public UndergraduateStudent(int studentID, String name) {
        super(studentID, name);
        this.tuition = 4000;
    }

    @Override
    public void setAnnualTuition(double annualTuition) {
        this.tuition = annualTuition;
    }

    @Override
    public String toString() {
        return super.toString() + "UndergraduateStudent : " +
                "tuition=" + tuition;
    }
}
