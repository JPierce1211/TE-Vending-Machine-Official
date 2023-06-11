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
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };
	private String sound;
	public String getFoodSound(){
		return sound;
	}
	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		//Use this line to test new code
		// Insert code here =

		// ============= end ===========
		//System.in (Look at command line and File I/O)
		Console console = new Console();
		console.displayMessage(WELCOME_MESSAGE);
		Inventory inventory = new Inventory(5);
		inventory.loadInventory();
		Map<String, InventoryItem> inventoryMap = new TreeMap<>();
<<<<<<< HEAD
		inventoryMap = inventory.getInventoryMap();
		VendingMachine vendingMachine = new VendingMachine(inventoryMap,5);
		while (true) {
=======
		//while (true) {
>>>>>>> 837573aa49681cb49237b31a53191aa36a974e66
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
<<<<<<< HEAD
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				inventoryMap = vendingMachine.getInventoryList();

				 InventoryItem inventoryOption = inventoryMap.get("//create variable to Capture userInput for slot number");
			}
		}//Insert  Console console = new Console();
		//console.displayMessage(getFoodSound());
=======
				inventoryMap = inventory.getInventoryMap();
				for (Map.Entry<String,InventoryItem> mainWarehouseEntry : inventoryMap.entrySet()) {
					System.out.println(mainWarehouseEntry.getKey() + " --- " + mainWarehouseEntry.getValue().getName() );
				}
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// display vending machine items
				inventoryMap = inventory.getInventoryMap();
				for (Map.Entry<String,InventoryItem> mainWarehouseEntry : inventoryMap.entrySet()) {
					System.out.println(mainWarehouseEntry.getKey() + " --- " + mainWarehouseEntry.getValue().getName() );
				}
			}
			if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				System.out.print("Please select an item for Purchase: ");
				String itemSelected = userInput.nextLine();

				//go to Intventory Item Map, get quantity display to the user of the itemSelected
				//Code here

				//ask the quantity and also to choose qunatity >= available quantity for that item
				//code here

				//update inventory item quantiry and make sale
			}
		//}
>>>>>>> 837573aa49681cb49237b31a53191aa36a974e66
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
