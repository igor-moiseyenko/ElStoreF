package com.imoiseyenko.elstoref.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.imoiseyenko.elstoref.domain.inventoryItem.InventoryItem;

@Entity
public class OrderItem extends DomainObject {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Order order;
	
	@OneToOne
	private InventoryItem inventoryItem;
	
	private int quantity;
	
	public OrderItem () {}
	
	public Order getOrder () {
	
		return order;
	}
	
	public void setOrder (Order order) {
	
		this.order = order;
	}
	
	public InventoryItem getInventoryItem () {
	
		return inventoryItem;
	}
	
	public void setInventoryItem (InventoryItem inventoryItem) {
	
		this.inventoryItem = inventoryItem;
	}
	
	public int getQuantity () {
	
		return quantity;
	}
	
	public void setQuantity (int quantity) {
	
		this.quantity = quantity;
	}

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			
			return false;
		}
		
		OrderItem other = (OrderItem) obj;
		
		// Is it need to compare 'order' field or not?
		if (this.inventoryItem.equalsByFields(other.inventoryItem)
				&& this.quantity == other.quantity) {
			
			return true;
		}
		
		return false;
	}

}
