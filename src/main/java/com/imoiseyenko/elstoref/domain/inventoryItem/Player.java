package com.imoiseyenko.elstoref.domain.inventoryItem;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="Player.findAllPlayers", query="SELECT p FROM Player p")
})
public class Player extends InventoryItem {
	
	private static final long serialVersionUID = 1L;
	
	private String caseMaterial;
	
	public Player () {}
	
	public String getCaseMaterial () {
	
		return caseMaterial;
	}
	
	public void setCaseMaterial (String caseMaterial) {
	
		this.caseMaterial = caseMaterial;
	}

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			
			return false;
		}
		
		Player other = (Player) obj;
		
		if (super.equalsByFields(other)
				&& this.caseMaterial.equals(other.caseMaterial)) {
			
			return true;
		}
		
		return false;
	}

}
