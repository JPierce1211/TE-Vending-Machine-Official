package com.techelevator;

public class Drinks extends InventoryItem{
    private String sound;
    public Drinks(String name, double price){
        super(name, price);
        sound = new String("Glug Glug, Yum");
    }
}
