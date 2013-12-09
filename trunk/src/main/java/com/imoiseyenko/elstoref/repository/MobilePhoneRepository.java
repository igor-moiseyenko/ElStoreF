package com.imoiseyenko.elstoref.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.inventoryItem.MobilePhone;
import com.imoiseyenko.elstoref.irepository.IMobilePhoneRepository;

@Repository
@Transactional
public class MobilePhoneRepository extends GenericRepository<MobilePhone>
		implements IMobilePhoneRepository {

	@Override
	public List<MobilePhone> findAllMobilePhones () {

		TypedQuery<MobilePhone> query = em.createNamedQuery(
				"MobilePhone.findAllMobilePhones", MobilePhone.class);

		return query.getResultList();
	}

}
