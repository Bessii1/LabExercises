package com.company.Lab5.Assignment1;

public class StudentAtLarge extends Student {
    private double tuition;

    public StudentAtLarge(int studentID, String name) {
        super(studentID, name);
        this.tuition = 2000;
    }

    @Override
    public void setAnnualTuition(double annualTuition) {
        this.tuition = annualTuition;
    }

    @Override
    public String toString() {
        return super.toString() + " StudentAtLarge : " +
                "tuition=" + tuition +
                '}';
    }
}
