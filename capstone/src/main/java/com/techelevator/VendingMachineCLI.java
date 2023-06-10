package com.techelevator;

import com.techelevator.view.Console;
import com.techelevator.view.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class VendingMachineCLI {

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
		inventoryMap = inventory.getInventoryMap();
		VendingMachine vendingMachine = new VendingMachine(inventoryMap,5);
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				inventoryMap = vendingMachine.getInventoryList();

				 InventoryItem inventoryOption = inventoryMap.get("//create variable to Capture userInput for slot number");
			}
		}//Insert  Console console = new Console();
		//console.displayMessage(getFoodSound());
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
