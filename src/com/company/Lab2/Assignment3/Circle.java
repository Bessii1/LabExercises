package com.company.Lab2.Assignment3;

public class Circle {
    private double radius;
    final double PI = 3.14159;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0.0;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * this.radius;
    }
}
