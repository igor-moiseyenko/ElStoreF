package com.imoiseyenko.elstoref.repository;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.irepository.IAccountRepository;

@Repository
@Transactional
public class AccountRepository extends GenericRepository<Account> implements IAccountRepository {

	@Override
	public Account findAccountByUsername (String username) {

		TypedQuery<Account> query = em.createNamedQuery("Account.findAccountByUsername", Account.class);
		query.setParameter("username", username);
		
		return query.getSingleResult();
	}

	@Override
	public Account findAccountByEmail (String email) {

		TypedQuery<Account> query = em.createNamedQuery("Account.findAccountByEmail", Account.class);
		query.setParameter("email", email);
		
		return query.getSingleResult();
	}

}
