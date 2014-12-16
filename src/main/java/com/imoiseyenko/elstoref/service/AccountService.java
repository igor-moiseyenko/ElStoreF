package com.imoiseyenko.elstoref.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.irepository.IAccountRepository;
import com.imoiseyenko.elstoref.iservice.IAccountService;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	private IAccountRepository accountRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Account createAccount (Account account) {
		
		return accountRepository.create(account);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Account findAccountById(Object id) {
		
		return accountRepository.findById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Account updateAccount(Account account) {
		
		return accountRepository.update(account);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteAccountById(Object id) {
		
		accountRepository.deleteById(id);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Account findAccountByUsername (String username) {

		return accountRepository.findAccountByUsername(username);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Account findAccountByEmail (String email) {

		return accountRepository.findAccountByEmail(email);
	}

}
