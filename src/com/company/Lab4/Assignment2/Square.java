package com.company.Lab4.Assignment2;

public class Square extends TwoDeminsionalShape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return Math.pow(a,2);
    }

    @Override
    public String toString() {
        return "Square";
    }
}
