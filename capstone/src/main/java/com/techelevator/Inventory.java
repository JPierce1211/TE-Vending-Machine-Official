package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inventory {
    private final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        Inventory inventoryRead = new Inventory();
        inventoryRead.run();
    }
    public void run(){

        try(userInput){
            File locateFile;
            System.out.println("What file is being searched?");
            String path = userInput.nextLine();
            locateFile = new File(path);
            if (!locateFile.exists()){
                System.out.println(path + " does not exist");
            }else if (!locateFile.isFile()){
                System.out.println(path + " is not a file");
            }
            File destinationFile;
            System.out.println("What is the destination file");
            path = userInput.nextLine();
            destinationFile = new File(path);
            if(path.isEmpty()){
                System.out.println("The intended is file is empty");
            }
            if(!destinationFile.getName().endsWith(".csv")){
                System.out.println("Destination file must end with .csv");
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
