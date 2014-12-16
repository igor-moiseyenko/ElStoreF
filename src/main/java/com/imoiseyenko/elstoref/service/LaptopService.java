package com.imoiseyenko.elstoref.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.inventoryItem.Laptop;
import com.imoiseyenko.elstoref.irepository.ILaptopRepository;
import com.imoiseyenko.elstoref.iservice.ILaptopService;

@Service
public class LaptopService implements ILaptopService {
	
	@Autowired
	private ILaptopRepository laptopRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Laptop createLaptop (Laptop laptop) {

		return laptopRepository.create(laptop);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Laptop findLaptopById (Object id) {

		return laptopRepository.findById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Laptop updateLaptop (Laptop laptop) {

		return laptopRepository.update(laptop);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteLaptopById (Object id) {

		laptopRepository.deleteById(id);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Laptop> findAllLaptops () {

		return laptopRepository.findAllLaptops();
	}

}
