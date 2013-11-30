package com.imoiseyenko.elstoref.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.inventoryItem.MobilePhone;
import com.imoiseyenko.elstoref.irepository.IMobilePhoneRepository;

@Repository
@Transactional
public class MobilePhoneRepository extends GenericRepository<MobilePhone> implements IMobilePhoneRepository {

}
