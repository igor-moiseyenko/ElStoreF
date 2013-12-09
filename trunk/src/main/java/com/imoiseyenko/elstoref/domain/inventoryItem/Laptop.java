package com.imoiseyenko.elstoref.domain.inventoryItem;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.CPUInfo;
import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.DRAMInfo;

@Entity
@NamedQueries({
	@NamedQuery(name="Laptop.findAllLaptops", query="SELECT l FROM Laptop l")
})
public class Laptop extends InventoryItem {
	
	private static final long serialVersionUID = 1L;
	
	private double screenDiagonal;
	private int batteryCapacity;
	
	@Embedded
	private DRAMInfo dramInfo;
	
	@Embedded
	private CPUInfo cpuInfo;
	
	public Laptop () {}
	
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
	
	public int getBatteryCapacity () {
	
		return batteryCapacity;
	}
	
	public void setBatteryCapacity (int batteryCapacity) {
	
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			
			return false;
		}
		
		Laptop other = (Laptop) obj;
		
		if (super.equalsByFields(other)
				&& this.screenDiagonal == other.screenDiagonal
				&& this.batteryCapacity == other.batteryCapacity
				&& this.dramInfo.equalsByFields(other.dramInfo)
				&& this.cpuInfo.equalsByFields(other.cpuInfo)) {
			
			return true;
		}
		
		return false;
	}
}
