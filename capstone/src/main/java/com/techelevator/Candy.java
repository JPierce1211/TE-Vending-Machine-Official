package com.techelevator;

public class Candy extends InventoryItem{
    private String sound;
    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private int itemQuantity;
    public Candy(String name, double price, String sound,int itemQuantity){
        super(name, price,itemQuantity);
        this.itemQuantity = itemQuantity;
        sound = new String("Munch Munch, Yum");
    }
}
