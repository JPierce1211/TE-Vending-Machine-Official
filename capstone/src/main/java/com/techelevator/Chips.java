package com.techelevator;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Chips extends InventoryItem{
    private String sound;
<<<<<<< HEAD
    public Chips(String name , double price, String sound){
        super(name, price);
        this.sound = sound;
=======

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private int itemQuantity;
    public Chips(String name , double price, String sound, int itemQuantity){
        super(name, price,itemQuantity);
        this.itemQuantity = itemQuantity;
        sound = new String("Crunch Crunch, Yum");
>>>>>>> 837573aa49681cb49237b31a53191aa36a974e66
    }


}
