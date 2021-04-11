package com.company.Lab12.Assignment2;

import java.util.HashMap;
import java.util.Map;

public class StockerMap{
    private Map<String,Stocker > stockerMap;

    public StockerMap() {
        stockerMap = new HashMap<>();
    }

    public void add(Stocker stocker) {
        stockerMap.put(stocker.getSymbol(), stocker);
    }

    public Stocker get(String symbol) {
        return stockerMap.get(symbol);
    }
}
