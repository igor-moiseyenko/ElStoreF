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

import com.imoiseyenko.elstoref.domain.inventoryItem.Laptop;
import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.CPUInfo;
import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.DRAMInfo;
import com.imoiseyenko.elstoref.domain.util.CategoryName;
import com.imoiseyenko.elstoref.domain.util.InventoryItemName;
import com.imoiseyenko.elstoref.irepository.ICategoryNameRepository;
import com.imoiseyenko.elstoref.irepository.IInventoryItemNameRepository;
import com.imoiseyenko.elstoref.irepository.ILaptopRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations={"classpath:config/main.xml"})
public class LaptopRepositoryTest {
	
	@Autowired
	private ICategoryNameRepository categoryNameRepository;
	
	@Autowired
	private IInventoryItemNameRepository inventoryItemNameRepository;
	
	@Autowired
	private ILaptopRepository laptopRepository;
	
	private CategoryName testCategoryName;
	
	private Laptop testLaptop;
	
	private Long testId;
	private InventoryItemName testInventoryItemName;
	private String testProducerName;
	private String testVersionName;
	private int testQuantityInStock;
	private double testPrice;
	private double testLength;
	private double testWidth;
	private double testThickness;
	private double testWeight;
	private double testScreenDiagonal;
	private int testBatteryCapacity;
	
	private DRAMInfo testDramInfo;
	private CPUInfo testCpuInfo;
	
	private double testPriceForUpdate;

	@Before
	public void setUp () {
		
		testCategoryName = new CategoryName("TestCategoryName");
		categoryNameRepository.create(testCategoryName);
		
		testInventoryItemName = new InventoryItemName("TestInvItemName", "TestMappingUrl");
		testCategoryName.addInventoryItemName(testInventoryItemName);
		inventoryItemNameRepository.create(testInventoryItemName);
		
		testId = null;
		testProducerName = "Sony";
		testVersionName = "test_v";
		testQuantityInStock = 100;
		testPrice = 1000.0;
		testLength = 20.0;
		testWidth = 12.0;
		testThickness = 2.0;
		testWeight = 1.5;
		testScreenDiagonal = 13.3;
		testBatteryCapacity = 2600;
		
		testLaptop = new Laptop();
		testLaptop.setId(testId);
		testLaptop.setInventoryItemName(testInventoryItemName);
		testLaptop.setProducerName(testProducerName);
		testLaptop.setVersionName(testVersionName);
		testLaptop.setQuantityInStock(testQuantityInStock);
		testLaptop.setPrice(testPrice);
		testLaptop.setLength(testLength);
		testLaptop.setWidth(testWidth);
		testLaptop.setThickness(testThickness);
		testLaptop.setWeight(testWeight);
		testLaptop.setScreenDiagonal(testScreenDiagonal);
		testLaptop.setBatteryCapacity(testBatteryCapacity);
		
		testDramInfo = new DRAMInfo("DDR3", 8, 2);
		testLaptop.setDramInfo(testDramInfo);
		
		testCpuInfo = new CPUInfo("Intel Chief River (2012)", 4, "Intel HM76 Express");
		testLaptop.setCpuInfo(testCpuInfo);
		
		testPriceForUpdate = 2000.0;
	}
	
	@After
	public void tearDown () {
		
		testLaptop = null;
		
		//inventoryItemNameRepository.deleteById(testInventoryItemName.getId());
		categoryNameRepository.deleteById(testCategoryName.getId());
	}
	
	@Test
	public void crudTest () {
		
		// Create
		Laptop createdLaptop = laptopRepository.create(testLaptop);
		Assert.assertNotNull(createdLaptop);
		Assert.assertNotNull(createdLaptop.getId());
		
		// Find
		Laptop foundedLaptop = laptopRepository.findById(createdLaptop.getId());
		Assert.assertNotNull(foundedLaptop);
		Assert.assertTrue(createdLaptop.equalsByFields(foundedLaptop));
		
		// Update
		foundedLaptop.setPrice(testPriceForUpdate);
		Laptop updatedLaptop = updateLaptop(foundedLaptop);
		Assert.assertNotNull(updatedLaptop);
		Assert.assertTrue(foundedLaptop.equalsByFields(updatedLaptop));
		
		// Delete
		deleteLaptopById(updatedLaptop.getId());
		Laptop deletedLaptop = laptopRepository.findById(updatedLaptop.getId());
		Assert.assertNull(deletedLaptop);
	}
	
	public Laptop createLaptop (Laptop laptop) {
		
		return laptopRepository.create(laptop);
	}
	
	public Laptop findLaptopById (Object id) {
		
		return laptopRepository.findById(id);
	}
	
	public Laptop updateLaptop (Laptop laptop) {
		
		return laptopRepository.update(laptop);
	}
	
	public void deleteLaptopById (Object id) {
		
		laptopRepository.deleteById(id);
	}
}
