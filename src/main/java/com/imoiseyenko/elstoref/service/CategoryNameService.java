package com.imoiseyenko.elstoref.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.util.CategoryName;
import com.imoiseyenko.elstoref.irepository.ICategoryNameRepository;
import com.imoiseyenko.elstoref.iservice.ICategoryNameService;

@Service
public class CategoryNameService implements ICategoryNameService {
	
	@Autowired
	private ICategoryNameRepository categoryNameRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public CategoryName createCategoryName (CategoryName categoryName) {

		return categoryNameRepository.create(categoryName);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public CategoryName findCategoryNameById (Object id) {

		return categoryNameRepository.findById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public CategoryName updateCategoryName (CategoryName categoryName) {

		return categoryNameRepository.update(categoryName);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteCategoryNameById (Object id) {

		categoryNameRepository.deleteById(id);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public CategoryName findCategoryNameByName (String name) {

		return categoryNameRepository.findCategoryNameByName(name);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<CategoryName> findAllCategoryNames () {

		return categoryNameRepository.findAllCategoryNames();
	}

}
