package com.company.Lab6.Assignment4;

import java.util.Arrays;

public class Student {
    public final int SIZEOFSTUDENTS = 5;
    public final int SIZEOFTEST = 4;
    private String studentNames[]=new String[SIZEOFSTUDENTS];
    private String grades []= {"A", "B", "C", "D", "F"};
    private double scoreOfStudent1[]=new double[SIZEOFTEST];
    private double scoreOfStudent2[]=new double[SIZEOFTEST];
    private double scoreOfStudent3[]=new double[SIZEOFTEST];
    private double scoreOfStudent4[]=new double[SIZEOFTEST];
    private double scoreOfStudent5[]=new double[SIZEOFTEST];

    public String getStudentNames(int i) {
        return studentNames[i];
    }

    public void setStudentNames(int i ,String studentNames) {
        this.studentNames[i] = studentNames;
    }

    public double[] getScoreOfStudent1() {
        return scoreOfStudent1;
    }

    public void setScoreOfStudent1(double[] scoreOfStudent1) {
        this.scoreOfStudent1 = scoreOfStudent1;
    }

    public double[] getScoreOfStudent2() {
        return scoreOfStudent2;
    }

    public void setScoreOfStudent2(double[] scoreOfStudent2) {
        this.scoreOfStudent2 = scoreOfStudent2;
    }

    public double[] getScoreOfStudent3() {
        return scoreOfStudent3;
    }

    public void setScoreOfStudent3(double[] scoreOfStudent3) {
        this.scoreOfStudent3 = scoreOfStudent3;
    }

    public double[] getScoreOfStudent4() {
        return scoreOfStudent4;
    }

    public void setScoreOfStudent4(double[] scoreOfStudent4) {
        this.scoreOfStudent4 = scoreOfStudent4;
    }

    public double[] getScoreOfStudent5() {
        return scoreOfStudent5;
    }

    public void setScoreOfStudent5(double[] scoreOfStudent5) {
        this.scoreOfStudent5 = scoreOfStudent5;
    }

    public String getStudentName(int i){
        return studentNames[i];
    }
    public String letterGrade(double score){
        if(score >= 90){
            return grades[0];
        }else if(score < 90 && score >= 80 ){
            return grades[1];
        }else if(score < 80 && score >= 70){
            return grades[2];
        }else if(score < 70 && score >= 60){
            return grades[3];
        }else {
            return grades[4];
        }
    }
    public double average(double [] array){
        double average= 0.0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNames=" + Arrays.toString(studentNames) +
                ", grades=" + Arrays.toString(grades) +
                ", scoreOfStudent1=" + Arrays.toString(scoreOfStudent1) +
                ", scoreOfStudent2=" + Arrays.toString(scoreOfStudent2) +
                ", scoreOfStudent3=" + Arrays.toString(scoreOfStudent3) +
                ", scoreOfStudent4=" + Arrays.toString(scoreOfStudent4) +
                ", scoreOfStudent5=" + Arrays.toString(scoreOfStudent5) +
                '}';
    }
}
