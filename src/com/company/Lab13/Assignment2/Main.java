package com.company.Lab13.Assignment2;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList=new MyLinkedList();
        System.out.println("The elements are: ");
        myLinkedList.add(("John"));
        myLinkedList.add(("Jack"));
        myLinkedList.add(("Mary"));

        System.out.println(myLinkedList);
        System.out.println("After adding Bob");
        myLinkedList.add(2,"Bob");
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.remove(1));
        System.out.println("After deleting Jack");
        System.out.println(myLinkedList);
        System.out.println("After deleting Bob: ");
        myLinkedList.remove("Bob");
        System.out.println(myLinkedList);
    }
}
