package com.techelevator;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory extends VendingMachine{
    private final Scanner userInput = new Scanner(System.in);
    private Map<String, InventoryItem> inventoryChart = new TreeMap<>();

    public Inventory(int capacity) {
        super(capacity);
    }


    public Map<String, InventoryItem> getInventoryMap() {
        return inventoryChart;
    }
    public Inventory(int capacity, Map<String, InventoryItem> inventoryList){
        super(capacity);
    }

    public void loadInventory() {
        File readFile = new File("vendingmachine.csv");
        try (Scanner inputScanner = new Scanner(readFile)) {
            while (inputScanner.hasNextLine()) {
                String line = inputScanner.nextLine();
                String[] lineData = line.split("\\|");
                String itemType = lineData[3];
                //item Quantity to br stocked to maximum of 5 while loading
                if(itemType.equals("Chip")){
<<<<<<< HEAD
                    Chips chip = new Chips(lineData[1],Double.parseDouble(lineData[2]), "Crunch Crunch, Yum");
                    inventoryChart.put(lineData[0], chip);
                }if(itemType.equals("Candy")){
                    Candy candy = new Candy(lineData[1], Double.parseDouble(lineData[2]),"Munch Munch, Yum");
                    inventoryChart.put(lineData[0], candy);
                }if(itemType.equals("Drink")){
                    Drinks drink = new Drinks(lineData[1], Double.parseDouble(lineData[2]),"Glug Glug, Yum");
                    inventoryChart.put(lineData[0], drink);
                }else {itemType.equals("Gum");
                    Gum gum = new Gum(lineData[1], Double.parseDouble(lineData[2]),"Chew Chew, Yum");
                    inventoryChart.put(lineData[0], gum);
=======
                    Chips chip = new Chips(lineData[1],Double.parseDouble(lineData[2]), "Crunch Crunch, Yum",5);
                    inventoryMap.put(lineData[0], chip);
                }if(itemType.equals("Candy")){
                    Candy candy = new Candy(lineData[1], Double.parseDouble(lineData[2]),"Munch Munch, Yum", 5);
                    inventoryMap.put(lineData[0], candy);
                }if(itemType.equals("Drink")){
                    Drinks drink = new Drinks(lineData[1], Double.parseDouble(lineData[2]),"Glug Glug, Yum",5);
                    inventoryMap.put(lineData[0], drink);
                }else {itemType.equals("Gum");
                    Gum gum = new Gum(lineData[1], Double.parseDouble(lineData[2]),"Chew Chew, Yum", 5);
                    inventoryMap.put(lineData[0], gum);
>>>>>>> 837573aa49681cb49237b31a53191aa36a974e66
                }
                if (readFile.exists()) {

                } else if (!readFile.isFile()) {
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
