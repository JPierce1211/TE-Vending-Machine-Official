package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inventory {
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Inventory inventoryRead = new Inventory();
        inventoryRead.run();
    }

    public void run() {
        File readFile = new File("vendingmachine.csv");
        try (Scanner inputScanner = new Scanner(readFile)) {
            while (inputScanner.hasNextLine()) {
                String line = inputScanner.nextLine();
                String[] lineData = line.split("\\|");

                if (readFile.exists()) {

                } else if (!readFile.isFile()) {

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //            File destinationFile;
//            System.out.println("What is the destination file");
//            path = userInput.nextLine();
//            destinationFile = new File(path);
//            if(path.isEmpty()){
//                System.out.println("The intended is file is empty");
//            }
//            if(!destinationFile.getName().endsWith(".csv")){
//                System.out.println("Destination file must end with .csv");

}
