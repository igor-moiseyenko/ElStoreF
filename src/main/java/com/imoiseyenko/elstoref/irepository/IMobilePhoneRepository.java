package com.imoiseyenko.elstoref.irepository;

import java.util.List;

import com.imoiseyenko.elstoref.domain.inventoryItem.MobilePhone;

public interface IMobilePhoneRepository extends IGenericRepository<MobilePhone> {

	public List<MobilePhone> findAllMobilePhones ();
}
