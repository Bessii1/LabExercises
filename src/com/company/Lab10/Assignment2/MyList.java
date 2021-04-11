package com.company.Lab10.Assignment2;

import java.util.ArrayList;

public class MyList<T extends Comparable> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T value) {
        list.add(value);
    }

    public T largest() {
        T largest = list.get(0);
        for (int index = 1; index < list.size(); index++) {
            T nextElement = list.get(index);
            if (nextElement.compareTo(largest) > 0) {
                largest = nextElement;
            }

        }
        return largest;
    }

    public T lowest() {
        T lowest = list.get(0);
        for (int index = 1; index < list.size(); index++) {
            T nextElement = list.get(index);
            if (nextElement.compareTo(lowest) > 0) {
                lowest = nextElement;
            }

        }
        return lowest;
    }
}
