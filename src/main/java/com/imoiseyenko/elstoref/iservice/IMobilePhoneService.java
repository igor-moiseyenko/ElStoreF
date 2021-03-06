package com.imoiseyenko.elstoref.iservice;

import java.util.List;

import com.imoiseyenko.elstoref.domain.inventoryItem.MobilePhone;

public interface IMobilePhoneService {

	public MobilePhone createMobilePhone (MobilePhone mobilePhone);
	
	public MobilePhone findMobilePhoneById (Object id);
	
	public MobilePhone updateMobilePhone (MobilePhone mobilePhone);
	
	public void deleteMobilePhoneById (Object id);
	
	public List<MobilePhone> findAllMobilePhones ();
}
