package com.company.Lab10.Assignment1;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(10);
        myList.add(120);
        myList.add(40);
        myList.add(4);
        myList.add(7);

        System.out.println("Largetst value is : " + myList.largest());


        MyList<Double> myList1 = new MyList<>();
        myList1.add(10.5);
        myList1.add(120.3);
        myList1.add(40.3);
        myList1.add(4.1);
        myList1.add(7.2);

        System.out.println("Largetst value is : " + myList.largest());
    }
}
