package com.imoiseyenko.elstoref.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.util.InventoryItemName;
import com.imoiseyenko.elstoref.irepository.IInventoryItemNameRepository;
import com.imoiseyenko.elstoref.iservice.IInventoryItemNameService;

@Service
public class InventoryItemNameService implements IInventoryItemNameService {
	
	@Autowired
	private IInventoryItemNameRepository inventoryItemNameRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public InventoryItemName createInventoryItemName (
			InventoryItemName inventoryItemName) {

		return inventoryItemNameRepository.create(inventoryItemName);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public InventoryItemName findInventoryItemNameById (Object id) {

		return inventoryItemNameRepository.findById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public InventoryItemName updateInventoryItemName (
			InventoryItemName inventoryItemName) {

		return inventoryItemNameRepository.update(inventoryItemName);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteInventoryItemNameById (Object id) {

		inventoryItemNameRepository.deleteById(id);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public InventoryItemName findInventoryItemNameByName (String name) {

		return inventoryItemNameRepository.findInventoryItemNameByName(name);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<InventoryItemName> findInventoryItemNamesByCategoryName (
			String categoryName) {

		return inventoryItemNameRepository.findInventoryItemNamesByCategoryName(categoryName);
	}

}
