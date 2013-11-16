package com.imoiseyenko.elstoref.iservice;

import com.imoiseyenko.elstoref.domain.Account;

public interface IAccountService {

	public Account createAccount (String username, String password, String email);
	
	public Account findAccountById (Object id);
	
	public Account updateAccount (Account account);
	
	public void deleteAccountById (Object id);
}
