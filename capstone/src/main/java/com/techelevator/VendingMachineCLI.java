package com.techelevator;

import com.techelevator.view.Console;
import com.techelevator.view.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachineCLI {
    private final Scanner userInput = new Scanner(System.in);
    private static final String WELCOME_MESSAGE = "Welcome to Vendo-Matic 800";
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_OPTION_Exit = "Exit";
    private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
    private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";
    private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";

    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_Exit};
    private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION};

    private Menu menu;

    public VendingMachineCLI(Menu menu) {
        this.menu = menu;
    }

    public void run() {
        //Use this line to test new code
        // Insert code here =

        // ============= end ===========
        Console console = new Console();
        console.displayMessage(WELCOME_MESSAGE);
        Inventory inventory = new Inventory();
        inventory.loadInventory();
        Transaction currentTransaction = new Transaction();
        Map<String, InventoryItem> currentInventoryMap = new TreeMap<>();
        while (true) {
            String mainMenuChoice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            if (mainMenuChoice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                // display vending machine items
                System.out.println("\n");
                currentInventoryMap = inventory.getInventoryMap();
                for (Map.Entry<String, InventoryItem> mainWarehouseEntry : currentInventoryMap.entrySet()) {
                    System.out.println(mainWarehouseEntry.getKey() + " --- " + mainWarehouseEntry.getValue().getName());
                }
            } else if (mainMenuChoice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                while (true) {
                    String purchaseMenuChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
                    if (purchaseMenuChoice.equals(PURCHASE_MENU_FEED_MONEY)) {
                        System.out.print("\nPlease feed the money in whole dollars: $");
                        String userFeedMoney = userInput.nextLine();
                        currentTransaction.addMoney(Double.parseDouble(userFeedMoney));
                        System.out.println("Total Money available: $" + currentTransaction.getMoneyFeed());
                    } else if (purchaseMenuChoice.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
                        currentInventoryMap = inventory.getInventoryMap();
                        for (Map.Entry<String, InventoryItem> mainWarehouseEntry : currentInventoryMap.entrySet()) {
                            System.out.println(mainWarehouseEntry.getKey() + " --- " + mainWarehouseEntry.getValue().getName() + " --- $" + mainWarehouseEntry.getValue().getPrice() + "  --- Available Quantity: " + mainWarehouseEntry.getValue().getItemQuantity());
                        }
                        try {
                            System.out.println("\nTotal Money available: $" + currentTransaction.getMoneyFeed());
                            System.out.print("*** Please select an item Code for purchase from  the above list: ");
                            InventoryItem getInventory = currentInventoryMap.get(userInput.nextLine().trim());
                            //check inventory availability
                            if (getInventory.getItemQuantity() < 1) {
                                System.out.println("\n*** The Item is SOLD OUT ***");
                                break;
                            }
                            if (currentTransaction.getMoneyFeed() < getInventory.getPrice()) {
                                System.out.println("*** Not enough Money for this purchase. The available balance is: $" + currentTransaction.getMoneyFeed() + ", Please feed money.");
                                break;
                            }
                            //subtract inventory of the sale
                            getInventory.subtractInventory();
                            //subtract transaction money from total feed money
                            currentTransaction.subtractMoney(getInventory.getPrice());
                            System.out.println("\n*** Your Purchase successfully completed for : " + getInventory.getName() + ", Price : $" + getInventory.getPrice() + " " + getInventory.getSound() + " ***");
                        } catch (Exception e) {

                            System.out.println("\nEntered Item not found.");
                        }
                    } else if (purchaseMenuChoice.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
                        System.out.println("Thanks for Using the Vending Machine purchase menu, Your Balance Money is: $" + currentTransaction.getMoneyFeed());
                        currentTransaction.setMoneyFeed(0);
                        break;
                    }
                }
            } else if (mainMenuChoice.equals(MAIN_MENU_OPTION_Exit)) {
                System.out.println("Thanks for Using the Vending Machine Bye !!!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }
}
