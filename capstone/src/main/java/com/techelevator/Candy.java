package com.techelevator;

public class Candy extends InventoryItem{
    private String sound;
    public Candy(String name, double price){
        super(name, price);
        sound = new String("Munch Munch, Yum");
    }
}
