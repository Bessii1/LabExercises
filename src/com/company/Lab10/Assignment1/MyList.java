package com.company.Lab10.Assignment1;

import java.util.ArrayList;

public class MyList<T extends Number> {
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
            if (nextElement.doubleValue() > largest.doubleValue()) {
                largest = nextElement;
            }

        }
        return largest;
    }

    public T lowest() {
        T lowest = list.get(0);
        for (int index = 1; index < list.size(); index++) {
            T nextElement = list.get(index);
            if (nextElement.doubleValue() < lowest.doubleValue()) {
                lowest = nextElement;
            }

        }
        return lowest;
    }
}
