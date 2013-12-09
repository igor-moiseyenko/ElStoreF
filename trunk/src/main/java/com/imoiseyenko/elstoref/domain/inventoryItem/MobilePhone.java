package com.imoiseyenko.elstoref.domain.inventoryItem;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.CPUInfo;
import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.DRAMInfo;

@Entity
@NamedQueries({
	@NamedQuery(name="MobilePhone.findAllMobilePhones", query="SELECT m FROM MobilePhone m")
})
public class MobilePhone extends InventoryItem {
	
	private static final long serialVersionUID = 1L;
	
	private double screenDiagonal;
	private int batteryCapacity;
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
	
	public int getBatteryCapacity () {
	
		return batteryCapacity;
	}
	
	public void setBatteryCapacity (int batteryCapacity) {
	
		this.batteryCapacity = batteryCapacity;
	}
	
	public double getCameraPixels () {
	
		return cameraPixels;
	}
	
	public void setCameraPixels (double cameraPixels) {
	
		this.cameraPixels = cameraPixels;
	}

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			
			return false;
		}
		
		MobilePhone other = (MobilePhone) obj;
		
		if (super.equalsByFields(other)
				&& this.screenDiagonal == other.screenDiagonal
				&& this.batteryCapacity == other.batteryCapacity
				&& this.cameraPixels == other.cameraPixels) {
			
			return true;
		}
		
		return false;
	}
}
