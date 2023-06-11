package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class InventoryItem extends Inventory implements TransactionMessage{
    private String name;
    private double price;
    private String sound;

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private int itemQuantity;
    public InventoryItem(String name, double price,int itemQuantity){
        this.name = name;
        this.price = price;
        this.itemQuantity = itemQuantity;
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

