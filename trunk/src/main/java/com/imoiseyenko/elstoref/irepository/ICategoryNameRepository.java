package com.imoiseyenko.elstoref.irepository;

import com.imoiseyenko.elstoref.domain.util.CategoryName;

public interface ICategoryNameRepository extends IGenericRepository<CategoryName>{

	public CategoryName findCategoryNameByName (String name);
}
