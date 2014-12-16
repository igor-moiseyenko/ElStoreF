package com.imoiseyenko.elstoref.repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.DomainObject;
import com.imoiseyenko.elstoref.irepository.IGenericRepository;

@Transactional
public abstract class GenericRepository<DO extends DomainObject> implements IGenericRepository<DO> {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Class<DO> type;
	
	public GenericRepository () {
		
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<DO>) pt.getActualTypeArguments()[0];
	}

	@Override
	public DO create (final DO domainObject) {
		
		em.persist(domainObject);
		
		return domainObject;
	}

	@Override
	public DO findById (final Object id) {
		
		return em.find(type, id);
	}

	@Override
	public DO update (final DO domainObject) {
		
		return em.merge(domainObject);
	}

	@Override
	public void deleteById(final Object id) {
		
		em.remove(em.getReference(type, id));
	}

}
