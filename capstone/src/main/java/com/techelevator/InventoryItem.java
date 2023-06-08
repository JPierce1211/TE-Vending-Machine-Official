package com.techelevator;

import java.math.BigDecimal;

public class InventoryItem {
    private String name;
    private double price;

    public InventoryItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
