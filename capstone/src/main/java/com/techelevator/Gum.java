package com.techelevator;

public class Gum extends InventoryItem{
private String sound;
    public Gum(String name, double price, String sound){
        super(name, price);
        sound = new String("Chew Chew, Yum");
    }
}
