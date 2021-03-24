package com.company.Lab4.Assignment2;

public class Tetrahedron extends ThreeDemensionalShape{
    private double b;
    private double a;
    private double h;
    private double d;

    public Tetrahedron(double b, double a, double h, double d) {
        this.b = b;
        this.a = a;
        this.h = h;
        this.d = d;
    }

    public double getArea() {
        return (b*h)/2;
    }

    public double getVolume() {
        return 1/6*(b*d)*a;
    }

    @Override
    public String toString() {
        return "Tetrahedron";
    }
}
