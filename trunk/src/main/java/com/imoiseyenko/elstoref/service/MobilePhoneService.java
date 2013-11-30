package com.imoiseyenko.elstoref.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.inventoryItem.MobilePhone;
import com.imoiseyenko.elstoref.irepository.IMobilePhoneRepository;
import com.imoiseyenko.elstoref.iservice.IMobilePhoneService;

@Service
public class MobilePhoneService implements IMobilePhoneService {
	
	@Autowired
	private IMobilePhoneRepository mobilePhoneRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public MobilePhone createMobilePhone (MobilePhone mobilePhone) {

		return mobilePhoneRepository.create(mobilePhone);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public MobilePhone findMobilePhoneById (Object id) {

		return mobilePhoneRepository.findById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public MobilePhone updateMobilePhone (MobilePhone mobilePhone) {

		return mobilePhoneRepository.update(mobilePhone);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteMobilePhoneById (Object id) {

		mobilePhoneRepository.deleteById(id);
	}

}
