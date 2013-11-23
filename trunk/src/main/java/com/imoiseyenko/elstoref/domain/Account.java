package com.imoiseyenko.elstoref.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Account", schema="dbo")
public class Account extends DomainObject {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String email;
	
	public Account () {}
	
	public Account (String username, String password, String email) {
		
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public String getUsername () {
		 
		return username;
	}
	
	public void setUsername (String username) {
		
		this.username = username;
	}
	
	public String getPassword () {
		
		return password;
	}
	
	public void setPassword (String password) {
		
		this.password = password;
	}

	public String getEmail () {
		
		return email;
	}

	public void setEmail (String email) {
		
		this.email = email;
	}

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			
			return false;
		}
		
		Account other = (Account) obj;
		
		if (this.username.equals(other.username)
				&& this.password.equals(other.password)
				&& this.email.equals(other.email)) {
			
			return true;
		}
		
		return false;
	}
}
