package com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo;

import javax.persistence.Embeddable;

import com.imoiseyenko.elstoref.domain.IComparableByFields;

@Embeddable
public class DRAMInfo implements IComparableByFields {

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

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			
			return false;
		}
		
		DRAMInfo other = (DRAMInfo) obj;
		
		if (this.type.equals(other.type)
				&& this.memory == other.memory
				&& this.numOfMemorySlots == other.numOfMemorySlots) {
			
			return true;
		}
		
		return false;
	}
}
