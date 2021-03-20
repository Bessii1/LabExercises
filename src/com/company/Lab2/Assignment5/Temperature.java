package com.company.Lab2.Assignment5;

public class Temperature {
    private double ftemp;

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getCelsius() {
        return ((this.getFahrenheit() - 32) * (5 / 9.0));
    }

    public double getKelvin() {
        return getCelsius() + 273;
    }
}
