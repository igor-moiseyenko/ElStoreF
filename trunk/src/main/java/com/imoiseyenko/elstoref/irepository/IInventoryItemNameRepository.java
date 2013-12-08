package com.imoiseyenko.elstoref.irepository;

import com.imoiseyenko.elstoref.domain.util.InventoryItemName;

public interface IInventoryItemNameRepository extends IGenericRepository<InventoryItemName> {

	public InventoryItemName findInventoryItemNameByName (String name);
}
