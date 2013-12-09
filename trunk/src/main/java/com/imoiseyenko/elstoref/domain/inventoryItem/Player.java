package com.imoiseyenko.elstoref.domain.inventoryItem;

import javax.persistence.Entity;

@Entity
public class Player extends InventoryItem {
	
	private static final long serialVersionUID = 1L;

	@Override
	public boolean equalsByFields (Object obj) {

		// TODO Auto-generated method stub
		return false;
	}

}
