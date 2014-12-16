package com.imoiseyenko.elstoref.irepository;

import java.util.List;

import com.imoiseyenko.elstoref.domain.inventoryItem.Laptop;

public interface ILaptopRepository extends IGenericRepository<Laptop> {

	public List<Laptop> findAllLaptops ();
}
