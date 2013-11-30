package com.imoiseyenko.elstoref.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.irepository.IAccountRepository;

@Repository
@Transactional
public class AccountRepository extends GenericRepository<Account> implements IAccountRepository {

}
