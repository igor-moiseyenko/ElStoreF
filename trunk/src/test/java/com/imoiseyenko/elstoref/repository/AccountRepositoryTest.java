package com.imoiseyenko.elstoref.repository;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.irepository.IAccountRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations={"classpath:config/main.xml"})
public class AccountRepositoryTest {

	@Autowired
	private IAccountRepository accountRepository;
	
	private Account testAccount;
	
	@Before
	public void setUp () {
		
		testAccount = new Account("testU", "testPWD", "test@gmail.com");
		testAccount.setId(null);
	}
	
	@After
	public void tearDown () {
		
		testAccount = null;
	}
	
	@Test
	public void createAccountTest () {
		
		Account account = accountRepository.create(testAccount);
		
		Assert.assertFalse(account.getId().equals(null));
	}
}
