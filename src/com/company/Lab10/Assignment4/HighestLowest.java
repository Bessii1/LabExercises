package com.company.Lab10.Assignment4;

import java.util.ArrayList;
import java.util.List;

public class HighestLowest<T extends Comparable> {
    private List<T> list;

    public HighestLowest() {
        list = new ArrayList<>();
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
            if (nextElement.compareTo(lowest)<0) {
                lowest = nextElement;
            }

        }
        return lowest;
    }
}
