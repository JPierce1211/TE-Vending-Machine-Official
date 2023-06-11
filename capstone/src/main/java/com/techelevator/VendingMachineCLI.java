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
		Map<String, InventoryItem> inventoryMap = new TreeMap<>();
		//while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
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
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
