package com.imoiseyenko.elstoref.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.inventoryItem.Laptop;
import com.imoiseyenko.elstoref.irepository.ILaptopRepository;

@Repository
@Transactional
public class LaptopRepository extends GenericRepository<Laptop> implements ILaptopRepository {

}
