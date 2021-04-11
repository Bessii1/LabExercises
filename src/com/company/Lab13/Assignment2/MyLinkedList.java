package com.company.Lab13.Assignment2;

public class MyLinkedList {
    private class Node {
        String value;
        Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(String value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int count = 0;
        Node p = first;

        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public void add(String s) {
        if (isEmpty()) {
            first = new Node(s);
            last = first;
        } else {
            last.next = new Node(s);
            last = last.next;
        }

    }

    public void add(int index, String s) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        if (index == 0) {
            first = new Node(s, first);
            if (last == null) {
                last = first;
            }
            return;
        }
        Node pred = first;
        for (int k = 1; k < index; k++) {
            pred = pred.next;
        }
        pred.next = new Node(s, pred.next);
        if (pred.next.next == null) {
            last = pred.next;
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node p = first;
        while (p != null) {
            stringBuilder.append(p.value + "\t");
            p = p.next;
        }
        return stringBuilder.toString();
    }

    public boolean remove(String element) {
        if (isEmpty())
            return false;
        if (element.equalsIgnoreCase(first.value)) {
            first = first.next;
            if (first == null) {
                last = null;
            }
            return true;
        }
        Node pred = first;
        while (!pred.next.value.equalsIgnoreCase(element) && pred.next != null) {
            pred = pred.next;
        }
        if (pred.next == null)
            return false;
        pred.next = pred.next.next;
        if (pred.next == null)
            last = pred;
        return true;
    }




    public String remove(int index) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        String element;
        if (index == 0) {
            element = first.value;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node pred = first;
            for (int k = 1; k < index; k++) {
                pred = pred.next;
            }
            element = pred.next.value;
            pred.next = pred.next.next;
            if (pred.next == null)
                last = pred;

        }
        return element;
    }
}
