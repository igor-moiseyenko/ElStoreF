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

import com.imoiseyenko.elstoref.domain.inventoryItem.MobilePhone;
import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.CPUInfo;
import com.imoiseyenko.elstoref.domain.inventoryItem.sparePartInfo.DRAMInfo;
import com.imoiseyenko.elstoref.domain.util.CategoryName;
import com.imoiseyenko.elstoref.domain.util.InventoryItemName;
import com.imoiseyenko.elstoref.irepository.ICategoryNameRepository;
import com.imoiseyenko.elstoref.irepository.IInventoryItemNameRepository;
import com.imoiseyenko.elstoref.irepository.IMobilePhoneRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations={"classpath:config/main.xml"})
public class MobilePhoneRepositoryTest {
	
	@Autowired
	private ICategoryNameRepository categoryNameRepository;
	
	@Autowired
	private IInventoryItemNameRepository inventoryItemNameRepository;
	
	@Autowired
	private IMobilePhoneRepository mobilePhoneRepository;
	
	private CategoryName testCategoryName;
	
	private MobilePhone testMobilePhone;
	
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
	private double testCameraPixels;
	private String testDescription;
	private String testImgUrl;
	
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
		testScreenDiagonal = 4.3;
		testBatteryCapacity = 1650;
		testCameraPixels = 8.0;
		testDescription = "test description";
		testImgUrl = "test/img/url.gif";
		
		testPriceForUpdate = 2000.0;
		
		testMobilePhone = new MobilePhone();
		testMobilePhone.setId(testId);
		testMobilePhone.setInventoryItemName(testInventoryItemName);
		testMobilePhone.setProducerName(testProducerName);
		testMobilePhone.setVersionName(testVersionName);
		testMobilePhone.setQuantityInStock(testQuantityInStock);
		testMobilePhone.setPrice(testPrice);
		testMobilePhone.setLength(testLength);
		testMobilePhone.setWidth(testWidth);
		testMobilePhone.setThickness(testThickness);
		testMobilePhone.setWeight(testWeight);
		testMobilePhone.setScreenDiagonal(testScreenDiagonal);
		testMobilePhone.setBatteryCapacity(testBatteryCapacity);
		testMobilePhone.setCameraPixels(testCameraPixels);
		testMobilePhone.setDescription(testDescription);
		testMobilePhone.setImgUrl(testImgUrl);
		
		testDramInfo = new DRAMInfo("MobileDRAM", 4, 1);
		testMobilePhone.setDramInfo(testDramInfo);
		
		testCpuInfo = new CPUInfo("Intel Chief River (2013)", 2, "Intel HM76 Express");
		testMobilePhone.setCpuInfo(testCpuInfo);
	}
	
	@After
	public void tearDown () {
		
		testMobilePhone = null;
		
		//inventoryItemNameRepository.deleteById(testInventoryItemName.getId());
		categoryNameRepository.deleteById(testCategoryName.getId());
	}
	
	@Test
	public void crudTest () {
		
		// Create
		MobilePhone createdMobilePhone = createMobilePhone(testMobilePhone);
		Assert.assertNotNull(createdMobilePhone);
		Assert.assertNotNull(createdMobilePhone.getId());
		
		// Find
		MobilePhone foundedMobilePhone = findMobilePhoneById(createdMobilePhone.getId());
		Assert.assertNotNull(foundedMobilePhone);
		Assert.assertTrue(createdMobilePhone.equalsByFields(foundedMobilePhone));
		
		// Update
		foundedMobilePhone.setPrice(testPriceForUpdate);
		MobilePhone updatedMobilePhone = updateMobilePhone(foundedMobilePhone);
		Assert.assertNotNull(updatedMobilePhone);
		Assert.assertTrue(foundedMobilePhone.equalsByFields(updatedMobilePhone));
		
		// Delete
		deleteMobilePhoneById(updatedMobilePhone.getId());
		MobilePhone deletedMobilePhone = findMobilePhoneById(updatedMobilePhone.getId());
		Assert.assertNull(deletedMobilePhone);
	}
	
	public MobilePhone createMobilePhone (MobilePhone mobilePhone) {
		
		return mobilePhoneRepository.create(mobilePhone);
	}
	
	public MobilePhone findMobilePhoneById (Object id) {
	
		return mobilePhoneRepository.findById(id);
	}
	
	public MobilePhone updateMobilePhone (MobilePhone mobilePhone) {
		
		return mobilePhoneRepository.update(mobilePhone);
	}
	
	public void deleteMobilePhoneById (Object id) {
		
		mobilePhoneRepository.deleteById(id);
	}
}
