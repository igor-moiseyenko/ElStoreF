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
import com.imoiseyenko.elstoref.irepository.ILaptopRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations={"classpath:config/main.xml"})
public class LaptopRepositoryTest {
	
	@Autowired
	private ILaptopRepository laptopRepository;
	
	private Laptop testLaptop;
	private DRAMInfo dramInfo;
	private CPUInfo cpuInfo;

	@Before
	public void setUp () {
		
		testLaptop = new Laptop();
		testLaptop.setId(null);
		testLaptop.setCategoryName(CategoryName.COMPUTERS);
		testLaptop.setInventoryItemName(InventoryItemName.LAPTOP);
		testLaptop.setProducerName("Sony");
		testLaptop.setVersionName("test_v");
		testLaptop.setQuantityInStock(100);
		testLaptop.setPrice(1000.0);
		testLaptop.setLength(20.0);
		testLaptop.setWidth(12.0);
		testLaptop.setThickness(2.0);
		testLaptop.setWidth(1.5);
		testLaptop.setScreenDiagonal(13.3);
		
		dramInfo = new DRAMInfo("DDR3", 8, 2);
		testLaptop.setDramInfo(dramInfo);
		
		cpuInfo = new CPUInfo("Intel Chief River (2012)", 4, "Intel HM76 Express");
		testLaptop.setCpuInfo(cpuInfo);
		
		testLaptop.setBatteryCapacity(2600);
		testLaptop.setRamSize(500.0);
	}
	
	@After
	public void tearDown () {
		
		testLaptop = null;
	}
	
	@Test
	public void createLaptopTest () {
		
		Laptop laptop = laptopRepository.create(testLaptop);
		
		Assert.assertNotNull(laptop.getId());
	}
}
