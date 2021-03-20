package com.company.Lab3.Assignment1;

import java.lang.Math;

public class Areas {

    public double getArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double getArea(double width, double length) {
        return width * length;
    }

    public double getArea(int r, double height) {
        return Math.PI * Math.pow(r, 2) * height;
    }
}
