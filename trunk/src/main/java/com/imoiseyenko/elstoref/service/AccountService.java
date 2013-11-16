package com.imoiseyenko.elstoref.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.irepository.IAccountRepository;
import com.imoiseyenko.elstoref.iservice.IAccountService;

@Service("accountService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class AccountService implements IAccountService {
	
	@Autowired
	private IAccountRepository accountRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Account createAccount (String username, String password, String email) {
		
		Account account = new Account(username, password, email);
		
		return accountRepository.create(account);
	}

	@Override
	public Account findAccountById(Object id) {
		
		return accountRepository.findById(id);
	}

	@Override
	public Account updateAccount(Account account) {
		
		return accountRepository.update(account);
	}

	@Override
	public void deleteAccountById(Object id) {
		
		accountRepository.deleteById(id);
	}

}
