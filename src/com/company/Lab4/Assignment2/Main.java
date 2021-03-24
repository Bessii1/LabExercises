package com.company.Lab4.Assignment2;


public class Main {

    public static void main(String[] args) {
        Shape array[]={new TwoDeminsionalShape(),new Circle(10),new Circle(12),new Square(10),new ThreeDemensionalShape(),
        new Sphere(10),new Cube(10,3),new Tetrahedron(10,10,10,10)};

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }



    }
}
