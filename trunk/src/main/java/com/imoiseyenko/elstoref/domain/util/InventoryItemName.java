package com.imoiseyenko.elstoref.domain.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.imoiseyenko.elstoref.domain.DomainObject;

@Entity
@Table(name = "InventoryItemName")
@NamedQueries({
		@NamedQuery(name = "InventoryItemName.findInventoryItemNameByName",
				query = "SELECT i FROM InventoryItemName i WHERE i.name = :name"),
		@NamedQuery(name = "InventoryItemName.findInventoryItemNamesByCategoryName",
				query = "SELECT i FROM InventoryItemName i WHERE i.categoryName.name = :categoryName")
})
public class InventoryItemName extends DomainObject {

	private static final long serialVersionUID = 1L;

	@ManyToOne(optional=false)
	private CategoryName categoryName;

	@Column(nullable=false, unique=true)
	private String name;
	
	@Column(nullable=false, unique=true)
	private String mappingUrl;

	public InventoryItemName () {

	}

	public InventoryItemName (String name, String mappingUrl) {

		this.name = name;
		this.mappingUrl = mappingUrl;
	}

	public CategoryName getCategoryName () {

		return categoryName;
	}

	public void setCategoryName (CategoryName categoryName) {

		this.categoryName = categoryName;
	}

	public String getName () {

		return name;
	}

	public void setName (String name) {

		this.name = name;
	}
	
	public String getMappingUrl () {
	
		return mappingUrl;
	}
	
	public void setMappingUrl (String mappingUrl) {
	
		this.mappingUrl = mappingUrl;
	}

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {

			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {

			return false;
		}

		InventoryItemName other = (InventoryItemName) obj;

		if (this.categoryName.equalsByFields(other.categoryName)
				&& this.name.equals(other.name)) {

			return true;
		}

		return false;
	}
}
