package com.imoiseyenko.elstoref.iservice;

import com.imoiseyenko.elstoref.domain.util.CategoryName;

public interface ICategoryNameService {

	public CategoryName createCategoryName (CategoryName categoryName);
	
	public CategoryName findCategoryNameById (Object id);
	
	public CategoryName updateCategoryName (CategoryName categoryName);
	
	public void deleteCategoryNameById (Object id);
	
	public CategoryName findCategoryNameByName (String name);
}
