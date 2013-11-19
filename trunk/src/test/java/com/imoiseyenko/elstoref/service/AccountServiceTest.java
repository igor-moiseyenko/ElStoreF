package com.imoiseyenko.elstoref.service;

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
import com.imoiseyenko.elstoref.iservice.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations={"classpath:config/main.xml"})
public class AccountServiceTest {

	@Autowired
	private IAccountService accountService;
	
	private Account testAccount;
	
	@Before
	public void setUp () {
		
		testAccount = new Account();
		testAccount.setId(null);
		testAccount.setUsername("user_test_s");
		testAccount.setPassword("pwd_test_s");
		testAccount.setEmail("test_s@gmail.com");
	}
	
	@After
	public void tearDown () {
		
		testAccount = null;
	}
	
	@Test
	public void createAccountTest () {
		
		Account account = accountService.createAccount(testAccount);
		
		Assert.assertNotNull(account.getId());
	}
}
