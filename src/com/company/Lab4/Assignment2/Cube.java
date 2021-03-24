package com.company.Lab4.Assignment2;

public class Cube extends ThreeDemensionalShape {
    private double a;
    private int sides;

    public Cube(double a, int sides) {
        this.a = a;
        this.sides = sides;
    }

    public double getArea() {
        return 6 * Math.pow(this.a, 2);
    }

    public double getVolume() {
        return Math.pow(this.sides, 3);
    }

    @Override
    public String toString() {
        return "Cube";
    }
}
