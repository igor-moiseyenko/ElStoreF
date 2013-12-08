package com.imoiseyenko.elstoref.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.imoiseyenko.elstoref.domain.util.CategoryName;
import com.imoiseyenko.elstoref.irepository.ICategoryNameRepository;

@Repository
public class CategoryNameRepository extends GenericRepository<CategoryName>
		implements ICategoryNameRepository {

	@Override
	public CategoryName findCategoryNameByName (String name) {

		TypedQuery<CategoryName> query = em.createNamedQuery(
				"CategoryName.findCategoryNameByName", CategoryName.class);
		
		query.setParameter("name", name);
		List<CategoryName> results = query.getResultList();

		return !results.isEmpty() ? results.get(0) : null;
	}

}
