package com.imoiseyenko.elstoref.irepository;

import java.util.List;

import com.imoiseyenko.elstoref.domain.util.CategoryName;

public interface ICategoryNameRepository extends IGenericRepository<CategoryName>{

	public CategoryName findCategoryNameByName (String name);
	
	public List<CategoryName> findAllCategoryNames ();
}
