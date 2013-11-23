package com.imoiseyenko.elstoref.domain.inventoryItem;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.CPUInfo;
import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.DRAMInfo;

@Entity
public class MobilePhone extends InventoryItem {
	
	private static final long serialVersionUID = 1L;
	
	private double screenDiagonal;
	private double batteryCapacity;
	private double ramSize;
	private double cameraPixels;
	
	@Embedded
	private DRAMInfo dramInfo;
	
	@Embedded
	private CPUInfo cpuInfo;
	
	public MobilePhone () {}
	
	public double getScreenDiagonal () {
	
		return screenDiagonal;
	}
	
	public void setScreenDiagonal (double screenDiagonal) {
	
		this.screenDiagonal = screenDiagonal;
	}
	
	public DRAMInfo getDramInfo () {
	
		return dramInfo;
	}
	
	public void setDramInfo (DRAMInfo dramInfo) {
	
		this.dramInfo = dramInfo;
	}
	
	public CPUInfo getCpuInfo () {
	
		return cpuInfo;
	}
	
	public void setCpuInfo (CPUInfo cpuInfo) {
	
		this.cpuInfo = cpuInfo;
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
	
	public double getCameraPixels () {
	
		return cameraPixels;
	}
	
	public void setCameraPixels (double cameraPixels) {
	
		this.cameraPixels = cameraPixels;
	}
}
