package com.imoiseyenko.elstoref.domain.inventoryItem;

public enum InventoryItemName {
	
	MOBILE_PHONE("Mobile phone"), LAPTOP("Laptop");
	
	private String name;
	
	InventoryItemName (String name) {
		
		this.name = name;
	}
	
	public String getName () {
	
		return name;
	}
}
