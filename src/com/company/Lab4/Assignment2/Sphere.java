package com.company.Lab4.Assignment2;

public class Sphere extends ThreeDemensionalShape{
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double getArea() {
        return 6*Math.PI*Math.pow(r,2);
    }
    
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}
