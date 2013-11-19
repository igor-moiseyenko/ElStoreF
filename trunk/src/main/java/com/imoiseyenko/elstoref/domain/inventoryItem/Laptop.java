package com.imoiseyenko.elstoref.domain.inventoryItem;

import javax.persistence.Entity;

@Entity
public class Laptop extends InventoryItem {
	
	private static final long serialVersionUID = 1L;
	
	private double screenDiagonal;
	private String os;
	private String processor;
	private double batteryCapacity;
	private double ramSize;
	
	public Laptop () {}
	
	public double getScreenDiagonal () {
	
		return screenDiagonal;
	}
	
	public void setScreenDiagonal (double screenDiagonal) {
	
		this.screenDiagonal = screenDiagonal;
	}
	
	public String getOs () {
	
		return os;
	}
	
	public void setOs (String os) {
	
		this.os = os;
	}
	
	public String getProcessor () {
	
		return processor;
	}
	
	public void setProcessor (String processor) {
	
		this.processor = processor;
	}
	
	public double getBatteryCapacity () {
	
		return batteryCapacity;
	}
	
	public void setBatteryCapacity (double batteryCapacity) {
	
		this.batteryCapacity = batteryCapacity;
	}
	
	public double getRamSize () {
	
		return ramSize;
	}
	
	public void setRamSize (double ramSize) {
	
		this.ramSize = ramSize;
	}
}
