package com.imoiseyenko.elstoref.irepository;

import java.util.List;

import com.imoiseyenko.elstoref.domain.util.InventoryItemName;

public interface IInventoryItemNameRepository extends IGenericRepository<InventoryItemName> {

	public InventoryItemName findInventoryItemNameByName (String name);
	
	public List<InventoryItemName> findInventoryItemNamesByCategoryName (String categoryName);
}
