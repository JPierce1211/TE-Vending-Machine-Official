package com.techelevator;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Chips extends InventoryItem{
    private String sound;
    public Chips(String name , double price, String sound){
        super(name, price);
        this.sound = sound;
    }


}
