package com.techelevator;

import java.util.Map;
import java.util.TreeMap;

public class VendingMachine{
    private int capacity;

    private int availableMoney;
   private Map<String, InventoryItem> inventoryList = new TreeMap<>();
public VendingMachine(int capacity){
    this.capacity = capacity;
    }
    public VendingMachine(Map<String, InventoryItem> inventoryList, int capacity){
        this.capacity = capacity;
        this.inventoryList = inventoryList;
    }

    public Map<String, InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public int loadMoney(int addMoney){
        availableMoney += 0; //figure out how to intake actual dollar amount
        return availableMoney;

    }


}

//method to calculate balance and return change