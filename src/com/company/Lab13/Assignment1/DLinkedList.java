package com.company.Lab13.Assignment1;

public class DLinkedList {
    private class Node {
        String value;
        Node next;
        Node previous;

        public Node(String value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node(String value) {
            this(value, null, null);
        }
    }

    private Node first;
    private Node last;

    public DLinkedList() {
        first = null;
        last = null;
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
            last.next = new Node(s, null, last);
            last = last.next;
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

    public void add(int index, String s) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        if (index == 0) {
            first = new Node(s, first, null);
            if (last == null) {
                last = first;
            }
            return;
        }
        Node pred = first;
        for (int k = 1; k < index; k++) {
            pred = pred.next;
        }
        Node succ = pred.next;
        Node middle = new Node(s, succ, pred);
        pred.next = middle;
        if (succ == null)
            last = middle;
        else
            succ.previous = middle;


    }

    public boolean remove(String element) {
        if (isEmpty())
            return false;

        Node target = first;
        while (!target.value.equalsIgnoreCase(element) && target != null) {
            target = target.next;
        }
        if (target == null)
            return false;
        Node pred=target.previous;
        Node succ=target.next;

        if (pred == null)
            first = succ;
        else
            pred.next=succ;
        if(succ==null)
            last=pred;
        else
            succ.previous=pred;
        return true;
    }


}
