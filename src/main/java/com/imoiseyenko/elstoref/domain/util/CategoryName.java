package com.imoiseyenko.elstoref.domain.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.imoiseyenko.elstoref.domain.DomainObject;

@Entity
@Table(name="CategoryName")
@NamedQueries({
	@NamedQuery(name="CategoryName.findCategoryNameByName", query="SELECT c FROM CategoryName c WHERE c.name = :name"),
	@NamedQuery(name="CategoryName.findAllCategoryNames", query="SELECT c FROM CategoryName c")
})
public class CategoryName extends DomainObject {
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="categoryName", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<InventoryItemName> inventoryItemNames = new ArrayList<>();
	
	@Column(nullable=false, unique=true)
	private String name;
	
	public CategoryName () {}
	
	public CategoryName (String name) {
		
		this.name = name;
	}
	
	public List<InventoryItemName> getInventoryItemNames () {
	
		return inventoryItemNames;
	}
	
	public void setInventoryItemNames (List<InventoryItemName> inventoryItemNames) {
	
		this.inventoryItemNames = inventoryItemNames;
	}

	public String getName () {
	
		return name;
	}
	
	public void setName (String name) {
	
		this.name = name;
	}
	
	public void addInventoryItemName (InventoryItemName inventoryItemName) {
		
		// Bidirectional mapping handling
		inventoryItemName.setCategoryName(this);
		this.inventoryItemNames.add(inventoryItemName);
	}
	
	public void removeInventoryItemName (InventoryItemName inventoryItemName) {
		
		// Bidirectional mapping handling
		this.inventoryItemNames.remove(inventoryItemName);
		inventoryItemName.setCategoryName(null);
	}
	
	@Override
	public boolean equalsByFields (Object obj) {
		
		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			
			return false;
		}
		
		CategoryName other = (CategoryName) obj;
		
		if (this.name.equals(other.name)) {
			
			return true;
		}
		
		return false;
	}
}
