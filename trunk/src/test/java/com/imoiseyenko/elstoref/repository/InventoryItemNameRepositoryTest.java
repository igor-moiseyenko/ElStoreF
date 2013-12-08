package com.imoiseyenko.elstoref.repository;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imoiseyenko.elstoref.domain.util.InventoryItemName;
import com.imoiseyenko.elstoref.irepository.IInventoryItemNameRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations={"classpath:config/main.xml"})
public class InventoryItemNameRepositoryTest {

	@Autowired
	private IInventoryItemNameRepository inventoryItemNameRepository;
	
	private InventoryItemName testInventoryItemName;
	private String testName;
	private String testNameForUpdate;
	
	@Before
	public void setUp () {
		
		testName = "Laptop";
		testInventoryItemName = new InventoryItemName(testName);
		testNameForUpdate = "MP3Player";
	}
	
	@After
	public void tearDown () {
		
		testInventoryItemName = null;
	}
	
	@Test
	public void crudTest () {
		
		// Create
		InventoryItemName createdInventoryItemName = createInventoryItemName(testInventoryItemName);
		Assert.assertNotNull(createdInventoryItemName);
		Assert.assertNotNull(createdInventoryItemName.getId());
		
		// Find by id
		InventoryItemName foundedInventoryItemName = findInventoryItemNameById(createdInventoryItemName.getId());
		Assert.assertNotNull(foundedInventoryItemName);
		Assert.assertTrue(createdInventoryItemName.equalsByFields(foundedInventoryItemName));
		
		// Update
		foundedInventoryItemName.setName(testNameForUpdate);
		InventoryItemName updatedInventoryItemName = updateInventoryItemName(foundedInventoryItemName);
		Assert.assertNotNull(updatedInventoryItemName);
		Assert.assertTrue(foundedInventoryItemName.equalsByFields(updatedInventoryItemName));
		
		// Delete
		deleteInventoryItemNameById(updatedInventoryItemName.getId());
		InventoryItemName deletedInventoryItemName = findInventoryItemNameById(updatedInventoryItemName.getId());
		Assert.assertNull(deletedInventoryItemName);
	}
	
	public InventoryItemName createInventoryItemName (InventoryItemName inventoryItemName) {
		
		return inventoryItemNameRepository.create(inventoryItemName);
	}
	
	public InventoryItemName findInventoryItemNameById (Object id) {
		
		return inventoryItemNameRepository.findById(id);
	}
	
	public InventoryItemName updateInventoryItemName (InventoryItemName inventoryItemName) {
		
		return inventoryItemNameRepository.update(inventoryItemName);
	}
	
	public void deleteInventoryItemNameById (Object id) {
		
		inventoryItemNameRepository.deleteById(id);
	}
	
	@Test
	public void findInventoryItemNameByName () {
		
		// Create
		InventoryItemName createdInventoryItemName = createInventoryItemName(testInventoryItemName);
		Assert.assertNotNull(createdInventoryItemName);
		Assert.assertNotNull(createdInventoryItemName.getId());
		
		// Find by name
		InventoryItemName foundedInventoryItemName = findInventoryItemNameByName(createdInventoryItemName.getName());
		Assert.assertNotNull(foundedInventoryItemName);
		Assert.assertTrue(createdInventoryItemName.equalsByFields(foundedInventoryItemName));
		
		// Delete
		deleteInventoryItemNameById(foundedInventoryItemName.getId());
		InventoryItemName deletedInventoryItemName = findInventoryItemNameById(foundedInventoryItemName.getId());
		Assert.assertNull(deletedInventoryItemName);
	}
	
	public InventoryItemName findInventoryItemNameByName (String name) {
		
		return inventoryItemNameRepository.findInventoryItemNameByName(name);
	}
}
