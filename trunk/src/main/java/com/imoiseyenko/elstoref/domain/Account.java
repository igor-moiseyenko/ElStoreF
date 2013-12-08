package com.imoiseyenko.elstoref.domain;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="Account", schema="dbo")
@NamedQueries({
	@NamedQuery(name="Account.findAccountByUsername", query="SELECT a FROM Account a WHERE a.username = :username"),
	@NamedQuery(name="Account.findAccountByEmail", query="SELECT a FROM Account a WHERE a.email = :email")
})
public class Account extends DomainObject {

	private static final long serialVersionUID = 1L;
	
	@Size(min=3, max=20, message="Username must be between 3 and 20 characters long.")
	@Pattern(regexp="^[a-zA-Z0-9_]+$", message="Username must be alphanumeric with no spaces.")
	private String username;
	
	@Size(min=6, max=20, message="The password must be between 3 and 20 characters long.")
	private String password;
	
	@Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",
			message="Invalid email address.")
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
