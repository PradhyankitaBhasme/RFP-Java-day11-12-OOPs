package com.bridgelabz.stockaccountmanagement;

public class Stock {
    String shareName;
    int numberOfShares;
    float sharePrice;
    float stockValue;

    @Override
    public String toString() {
        return "\n"+"Stock{" +
                "shareName='" + shareName + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                ", stockValue=" + stockValue +
                '}';
    }
}