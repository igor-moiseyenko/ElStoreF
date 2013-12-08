package com.imoiseyenko.elstoref.iservice;

import com.imoiseyenko.elstoref.domain.util.InventoryItemName;

public interface IInventoryItemNameService {

	public InventoryItemName createInventoryItemName (InventoryItemName inventoryItemName);
	
	public InventoryItemName findInventoryItemNameById (Object id);
	
	public InventoryItemName updateInventoryItemName (InventoryItemName inventoryItemName);
	
	public void deleteInventoryItemNameById (Object id);
	
	public InventoryItemName findInventoryItemNameByName (String name);
}
