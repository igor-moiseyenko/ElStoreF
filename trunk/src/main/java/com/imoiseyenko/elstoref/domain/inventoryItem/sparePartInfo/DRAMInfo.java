package com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo;

import javax.persistence.Embeddable;

@Embeddable
public class DRAMInfo {

	private String type;
	private double memory;
	private int numOfMemorySlots;
	
	public DRAMInfo () {}
	
	public DRAMInfo (String type, double memory, int numOfMemorySlots) {
		
		this.type = type;
		this.memory = memory;
		this.numOfMemorySlots = numOfMemorySlots;
	}
	
	public String getType () {
	
		return type;
	}
	
	public void setType (String type) {
	
		this.type = type;
	}
	
	public double getMemory () {
	
		return memory;
	}
	
	public void setMemory (double memory) {
	
		this.memory = memory;
	}
	
	public int getNumOfMemorySlots () {
	
		return numOfMemorySlots;
	}
	
	public void setNumOfMemorySlots (int numOfMemorySlots) {
	
		this.numOfMemorySlots = numOfMemorySlots;
	}
}
