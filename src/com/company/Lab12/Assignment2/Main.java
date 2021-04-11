package com.company.Lab12.Assignment2;

public class Main {
    public static void main(String[] args) {
        StockerMap stockerMap = new StockerMap();
        Stocker[] stockers = {
                new Stocker("bitcoin", 51.7),
                new Stocker("etherum", 32.2),
                new Stocker("APA", 21.4)
        };

        for (Stocker stocker : stockers) {
            stockerMap.add(stocker);
        }
        Stocker stocker = stockerMap.get("bitcoin");
        if (stocker == null) {
            System.out.println("Employee Not found");
        } else {
            System.out.println(stocker);
        }
    }
}
