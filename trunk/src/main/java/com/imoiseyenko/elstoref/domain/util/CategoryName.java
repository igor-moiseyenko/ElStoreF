package com.imoiseyenko.elstoref.domain.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.imoiseyenko.elstoref.domain.DomainObject;

@Entity
@Table(name="CategoryName", schema="dbo")
@NamedQueries({
	@NamedQuery(name="CategoryName.findCategoryNameByName", query="SELECT c FROM CategoryName c WHERE c.name = :name")
})
public class CategoryName extends DomainObject {
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, unique=true)
	private String name;
	
	public CategoryName () {}
	
	public CategoryName (String name) {
		
		this.name = name;
	}
	public String getName () {
	
		return name;
	}
	
	public void setName (String name) {
	
		this.name = name;
	}
	
	@Override
	public boolean equalsByFields (Object obj) {
		
		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			
			return false;
		}
		
		CategoryName other = (CategoryName) obj;
		
		if (this.name.equals(other.name)) {
			
			return true;
		}
		
		return false;
	}
}
