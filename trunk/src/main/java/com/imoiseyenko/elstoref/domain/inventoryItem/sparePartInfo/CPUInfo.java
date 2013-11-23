package com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo;

import javax.persistence.Embeddable;

@Embeddable
public class CPUInfo {

	private String platform;
	private int numOfCores;
	private String chipset;
	
	public CPUInfo () {}

	public CPUInfo (String platform, int numOfCores, String chipset) {
		
		this.platform = platform;
		this.numOfCores = numOfCores;
		this.chipset = chipset;
	}
	
	public String getPlatform () {
	
		return platform;
	}
	
	public void setPlatform (String platform) {
	
		this.platform = platform;
	}
	
	public int getNumOfCores () {
	
		return numOfCores;
	}
	
	public void setNumOfCores (int numOfCores) {
	
		this.numOfCores = numOfCores;
	}
	
	public String getChipset () {
	
		return chipset;
	}
	
	public void setChipset (String chipset) {
	
		this.chipset = chipset;
	}
	
}
