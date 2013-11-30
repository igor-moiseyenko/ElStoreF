package com.imoiseyenko.elstoref.irepository;

import com.imoiseyenko.elstoref.domain.DomainObject;

public interface IGenericRepository<DO extends DomainObject> {

	public DO create (DO domainObject);
	
	public DO findById (Object id);
	
	public DO update (DO domainObject);
	
	public void deleteById (Object id);
}
