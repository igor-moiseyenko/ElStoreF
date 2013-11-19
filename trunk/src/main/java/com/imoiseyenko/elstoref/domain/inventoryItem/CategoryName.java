package com.imoiseyenko.elstoref.domain.inventoryItem;

public enum CategoryName {

	PHONES("Phones"), COMPUTERS("Computers"), AUDIO("Audio");
	
	private String name;
	
	CategoryName (String name) {
		
		this.name = name;
	}
	
	public String getName () {
	
		return name;
	}
}
