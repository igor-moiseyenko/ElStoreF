package com.imoiseyenko.elstoref.iservice;

import java.util.List;

import com.imoiseyenko.elstoref.domain.inventoryItem.Laptop;

public interface ILaptopService {

	public Laptop createLaptop (Laptop laptop);
	
	public Laptop findLaptopById (Object id);
	
	public Laptop updateLaptop (Laptop laptop);
	
	public void deleteLaptopById (Object id);
	
	public List<Laptop> findAllLaptops ();
}
