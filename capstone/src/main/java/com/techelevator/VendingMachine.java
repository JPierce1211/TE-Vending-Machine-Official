package com.techelevator;

import java.util.Map;
import java.util.TreeMap;

public class VendingMachine{
    private int capacity;
    private boolean returnChange;
    private int balance;
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
    public void giveChange(boolean returnChange){
    this.returnChange = returnChange;
    }

    public int loadMoney(int addMoney){
        availableMoney += 0; //figure out how to intake actual dollar amount
        return availableMoney;

    }
    public int makePurchase(int availableMoney, Map<String, InventoryItem> inventoryList){
    balance = availableMoney - inventoryList.get()//price of Item

    if(returnChange = false){
        System.out.println();
    }else{

    }return balance;


    }


}

//method to calculate balance and return change