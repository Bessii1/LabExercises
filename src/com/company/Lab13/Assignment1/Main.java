package com.company.Lab13.Assignment1;

public class Main {
    public static void main(String[] args) {
        DLinkedList myLinkedList=new DLinkedList();
        System.out.println("The elements are: ");
        myLinkedList.add(("John"));
        myLinkedList.add(("Jack"));
        myLinkedList.add(("Mary"));

        System.out.println(myLinkedList);
        System.out.println("After adding Bob");
        myLinkedList.add(2,"Bob");
        System.out.println(myLinkedList);

        System.out.println("After deleting Jack: ");
        myLinkedList.remove("Jack");
        System.out.println(myLinkedList);



    }
}
