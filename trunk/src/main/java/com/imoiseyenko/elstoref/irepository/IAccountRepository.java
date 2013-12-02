package com.imoiseyenko.elstoref.irepository;

import com.imoiseyenko.elstoref.domain.Account;

public interface IAccountRepository extends IGenericRepository<Account> {

	public Account findAccountByUsername (String username);
	
	public Account findAccountByEmail (String email);
}
