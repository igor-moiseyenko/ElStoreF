package com.imoiseyenko.elstoref.domain.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.imoiseyenko.elstoref.domain.DomainObject;

@Entity
@Table(name="InventoryItemName", schema="dbo")
@NamedQueries({
	@NamedQuery(name="InventoryItemName.findInventoryItemNameByName", query="SELECT i FROM InventoryItemName i WHERE i.name = :name")
})
public class InventoryItemName extends DomainObject {
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, unique=true)
	private String name;
	
	public InventoryItemName () {}
	
	public InventoryItemName (String name) {
		
		this.name = name;
	}
	
	public String getName () {
	
		return name;
	}
	
	public void setName (String name) {
	
		this.name = name;
	}
	
	@Override
	public boolean equalsByFields (Object obj) {
		
		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			
			return false;
		}
		
		InventoryItemName other = (InventoryItemName) obj;
		
		if (this.name.equals(other.name)) {
			
			return true;
		}
		
		return false;
	}
}
