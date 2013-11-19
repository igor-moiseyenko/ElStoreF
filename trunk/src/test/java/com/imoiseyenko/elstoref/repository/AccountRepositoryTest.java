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
	
	private Long testId;
	private String testUsername;
	private String testPassword;
	private String testEmail;
	
	@Before
	public void setUp () {
		
		testId = null;
		testUsername = "test_u";
		testPassword = "test_pwd";
		testEmail = "test@gmail.com";
		
		testAccount = new Account();
		testAccount.setId(testId);
		testAccount.setUsername(testUsername);
		testAccount.setPassword(testPassword);
		testAccount.setEmail(testEmail);
	}
	
	@After
	public void tearDown () {
		
		testAccount = null;
	}
	
	@Test
	public void crudTest () {
		
		Account account = createAccount(testAccount);
		findAccountById(account.getId());
		updateAccount(account);
		deleteAccountById(account.getId());
	}
	
	public Account createAccount (Account account) {
		
		Account createdAccount = accountRepository.create(account);
		
		Assert.assertNotNull(createdAccount.getId());
		
		return createdAccount;
	}
	
	public void findAccountById (Object id) {
		
		Account foundedAccount = accountRepository.findById(id);
		
		Assert.assertNotNull(foundedAccount);
		
		Assert.assertEquals(id, foundedAccount.getId());
		Assert.assertEquals(testUsername, foundedAccount.getUsername());
		Assert.assertEquals(testPassword, foundedAccount.getPassword());
		Assert.assertEquals(testEmail, foundedAccount.getEmail());
	}
	
	public void updateAccount (Account account) {
		
		Account foundedAccount = accountRepository.findById(account.getId());
		
		foundedAccount.setUsername("upd_u");
		foundedAccount.setPassword("upd_pwd");
		foundedAccount.setEmail("upd_email@gmail.com");
		
		Account updatedAccount = accountRepository.update(foundedAccount);
		
		Assert.assertEquals("upd_u", updatedAccount.getUsername());
		Assert.assertEquals("upd_pwd", updatedAccount.getPassword());
		Assert.assertEquals("upd_email@gmail.com", updatedAccount.getEmail());
	}
	
	public void deleteAccountById (Object id) {
		
		accountRepository.deleteById(id);
		
		Account foundedAccount = accountRepository.findById(id);
		
		Assert.assertNull(foundedAccount);
	}
}
