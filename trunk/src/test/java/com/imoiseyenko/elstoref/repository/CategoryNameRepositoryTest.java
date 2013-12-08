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

import com.imoiseyenko.elstoref.domain.util.CategoryName;
import com.imoiseyenko.elstoref.irepository.ICategoryNameRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations={"classpath:config/main.xml"})
public class CategoryNameRepositoryTest {

	@Autowired
	private ICategoryNameRepository categoryNameRepository;
	
	private CategoryName testCategoryName;
	private String testName;
	private String testNameForUpdate;
	
	@Before
	public void setUp () {
		
		testName = "Computers";
		testCategoryName = new CategoryName(testName);
		testNameForUpdate = "Audio";
	}
	
	@After
	public void tearDown () {
		
		testCategoryName = null;
	}
	
	@Test
	public void crudTest () {
		
		// Create
		CategoryName createdCategoryName = createCategoryName(testCategoryName);
		Assert.assertNotNull(createdCategoryName);
		Assert.assertNotNull(createdCategoryName.getId());
		
		// Find by id
		CategoryName foundedCategoryName = findCategoryNameById(createdCategoryName.getId());
		Assert.assertNotNull(foundedCategoryName);
		Assert.assertTrue(createdCategoryName.equalsByFields(foundedCategoryName));
		
		// Update
		foundedCategoryName.setName(testNameForUpdate);
		CategoryName updatedCategoryName = updateCategoryName(foundedCategoryName);
		Assert.assertNotNull(updatedCategoryName);
		Assert.assertTrue(foundedCategoryName.equalsByFields(updatedCategoryName));
		
		// Delete
		deleteCategoryName(updatedCategoryName.getId());
		CategoryName deletedCategoryName = findCategoryNameById(updatedCategoryName.getId());
		Assert.assertNull(deletedCategoryName);
	}
	
	public CategoryName createCategoryName (CategoryName categoryName) {
		
		return categoryNameRepository.create(categoryName);
	}
	
	public CategoryName findCategoryNameById (Object id) {
		
		return categoryNameRepository.findById(id);
	}
	
	public CategoryName updateCategoryName (CategoryName categoryName) {
		
		return categoryNameRepository.update(categoryName);
	}
	
	public void deleteCategoryName (Object id) {
		
		categoryNameRepository.deleteById(id);
	}
	
	@Test
	public void findCategoryNameByNameTest () {
		
		// Create
		CategoryName createdCategoryName = createCategoryName(testCategoryName);
		Assert.assertNotNull(createdCategoryName);
		Assert.assertNotNull(createdCategoryName.getId());
		
		// Find by name
		CategoryName foundedCategoryName = categoryNameRepository.findCategoryNameByName(createdCategoryName.getName());
		Assert.assertNotNull(foundedCategoryName);
		Assert.assertTrue(createdCategoryName.equalsByFields(foundedCategoryName));
		
		// Delete
		deleteCategoryName(foundedCategoryName.getId());
		CategoryName deletedCategoryName = findCategoryNameById(foundedCategoryName.getId());
		Assert.assertNull(deletedCategoryName);
	}
}
