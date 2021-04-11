package com.company.Lab10.Assignment3;

public class PointList<T> {

    private T pointX;
    private T pointY;

    public PointList(T pointX, T pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public T getPointX() {
        return pointX;
    }

    public void setPointX(T pointX) {
        this.pointX = pointX;
    }

    public T getPointY() {
        return pointY;
    }

    public void setPointY(T pointY) {
        this.pointY = pointY;
    }

    @Override
    public String toString() {
        return "PointList{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}
