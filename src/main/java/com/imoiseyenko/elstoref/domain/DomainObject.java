package com.imoiseyenko.elstoref.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class DomainObject implements Serializable, IComparableByFields {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	public Long getId () {
		
		return id;
	}

	public void setId (Long id) {
		
		this.id = id;
	}
	
	@Override
	public int hashCode () {
	
		return id != null ? id.intValue() : super.hashCode();
	}
	
	@Override
	public boolean equals (Object obj) {
		
		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			
			return false;
		}
		
		DomainObject other = (DomainObject) obj;
		
		if ((this.getId() == null) || (other.getId() == null)) {
			
			return false;
		}
		
		return this.getId().equals(other.getId());
	}
}
