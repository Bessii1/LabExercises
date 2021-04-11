package com.company.Lab12.Assignment2;

import java.util.Objects;

public class Stocker {
    private String symbol;
    private double sharePrice;

    public Stocker(String symbol, double sharePrice) {
        this.symbol = symbol;
        this.sharePrice = sharePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stocker stocker = (Stocker) o;
        return Double.compare(stocker.sharePrice, sharePrice) == 0 && symbol.equals(stocker.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "Stocker{" +
                "symbol='" + symbol + '\'' +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
