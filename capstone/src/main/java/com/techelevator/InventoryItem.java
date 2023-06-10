package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class InventoryItem{//extends Inventory{
    private String name;
    private double price;
    private String sound;

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
    public final String getFoodSound(){
        String itemSound = sound;
        return itemSound;
    }

}

