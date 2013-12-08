package com.imoiseyenko.elstoref.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.imoiseyenko.elstoref.domain.util.InventoryItemName;
import com.imoiseyenko.elstoref.irepository.IInventoryItemNameRepository;

@Repository
public class InventoryItemNameRepository extends
		GenericRepository<InventoryItemName> implements
		IInventoryItemNameRepository {

	@Override
	public InventoryItemName findInventoryItemNameByName (String name) {

		TypedQuery<InventoryItemName> query = em.createNamedQuery(
				"InventoryItemName.findInventoryItemNameByName",
				InventoryItemName.class);
		
		query.setParameter("name", name);
		List<InventoryItemName> results = query.getResultList();
		
		return !results.isEmpty() ? results.get(0) : null;
	}

}
