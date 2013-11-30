package com.imoiseyenko.elstoref.domain.util;

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
