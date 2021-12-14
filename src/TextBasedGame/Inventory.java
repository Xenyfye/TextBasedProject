package TextBasedGame;

import java.util.ArrayList;

public class Inventory {
	
	public ArrayList<String> playerInventory;

	public Inventory(int inventorySize) {
		this.playerInventory = new ArrayList<String>(inventorySize);
	}
	
	public void addItem(String itemName) {
		playerInventory.add(itemName);
	}
	
	public Boolean checkForItem(String itemName) {
		return playerInventory.contains(itemName);
	}

	@Override
	public String toString() {
		return "You currently possess: " + playerInventory;
	}
	
	
	
}
