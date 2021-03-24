package com.company.Lab4.Assignment2;

public class Circle extends TwoDeminsionalShape {
    private double r;


    public Circle(double r) {
        this.r = r;

    }

    public double getArea() {
        return 1 / 2 * (Math.PI * Math.pow(r, 2));
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
