package com.company.Lab6.Assignment1;

public class SportsCar {
    private CarColor color;
    private CarType type;
    private double price;

    public SportsCar(CarColor color, CarType type, double price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "color=" + color +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
