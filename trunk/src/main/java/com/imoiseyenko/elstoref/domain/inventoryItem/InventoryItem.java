package com.imoiseyenko.elstoref.domain.inventoryItem;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.imoiseyenko.elstoref.domain.DomainObject;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class InventoryItem extends DomainObject {

	private static final long serialVersionUID = 1L;
	
	private CategoryName categoryName;
	private InventoryItemName inventoryItemName;
	private String producerName;
	private String versionName;
	private int quantityInStock;
	private double price;
	private double length;
	private double width;
	private double thickness;
	private double weight;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dateOfEntry;
	
	public InventoryItem () {}
	
	public CategoryName getCategoryName () {
	
		return categoryName;
	}
	
	public void setCategoryName (CategoryName categoryName) {
	
		this.categoryName = categoryName;
	}
	
	public InventoryItemName getInventoryItemName () {
		
		return inventoryItemName;
	}
	
	public void setInventoryItemName (InventoryItemName inventoryItemName) {
		
		this.inventoryItemName = inventoryItemName;
	}
	
	public String getProducerName () {
	
		return producerName;
	}
	
	public void setProducerName (String producerName) {
	
		this.producerName = producerName;
	}
	
	public String getVersionName () {
	
		return versionName;
	}
	
	public void setVersionName (String versionName) {
	
		this.versionName = versionName;
	}
	
	public int getQuantityInStock () {
	
		return quantityInStock;
	}
	
	public void setQuantityInStock (int quantityInStock) {
	
		this.quantityInStock = quantityInStock;
	}
	
	public double getPrice () {
	
		return price;
	}
	
	public void setPrice (double price) {
	
		this.price = price;
	}
	
	public double getLength () {
	
		return length;
	}
	
	public void setLength (double length) {
	
		this.length = length;
	}
	
	public double getWidth () {
	
		return width;
	}
	
	public void setWidth (double width) {
	
		this.width = width;
	}
	
	public double getThickness () {
	
		return thickness;
	}
	
	public void setThickness (double thickness) {
	
		this.thickness = thickness;
	}
	
	public double getWeight () {
	
		return weight;
	}
	
	public void setWeight (double weight) {
	
		this.weight = weight;
	}
	
	public Calendar getDateOfEntry () {
	
		return dateOfEntry;
	}
	
	public void setDateOfEntry (Calendar dateOfEntry) {
	
		this.dateOfEntry = dateOfEntry;
	}
}
