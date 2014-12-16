package com.imoiseyenko.elstoref.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.inventoryItem.Laptop;
import com.imoiseyenko.elstoref.irepository.ILaptopRepository;

@Repository
@Transactional
public class LaptopRepository extends GenericRepository<Laptop> implements
		ILaptopRepository {

	@Override
	public List<Laptop> findAllLaptops () {

		TypedQuery<Laptop> query = em.createNamedQuery("Laptop.findAllLaptops",
				Laptop.class);

		return query.getResultList();
	}

}
