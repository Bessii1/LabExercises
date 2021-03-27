package com.company.Lab5.Assignment1;

public class GraduateStudents extends Student {
    private double tuition;

    public GraduateStudents(int studentID, String name) {
        super(studentID, name);
        this.tuition = 6000;
    }

    @Override
    public void setAnnualTuition(double annualTuition) {
        this.tuition = annualTuition;
    }

    @Override
    public String toString() {
        return super.toString() + "GraduateStudents : " +
                "tuition=" + tuition;
    }
}
