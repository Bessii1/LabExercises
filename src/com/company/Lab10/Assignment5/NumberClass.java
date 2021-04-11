package com.company.Lab10.Assignment5;

import java.util.ArrayList;

public class NumberClass<T extends Number> {
    private ArrayList<T> list;

    public NumberClass() {
        list = new ArrayList<>();
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

    public double total() {
        double total = 0;
        for (int i = 1; i < list.size(); i++) {
            total += list.get(i).doubleValue();
        }
        return total;
    }

    public double average() {
        return total() / list.size();
    }


}
