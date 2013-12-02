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
	
	private String testEmailForUpdate;
	
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
		
		testEmailForUpdate = "test_upd@gmail.com";
	}
	
	@After
	public void tearDown () {
		
		testAccount = null;
	}
	
	@Test
	public void crudTest () {
		
		// Create
		Account createdAccount = createAccount(testAccount);
		Assert.assertNotNull(createdAccount.getId());
		
		// Find
		Account foundedAccount = findAccountById(createdAccount.getId());
		Assert.assertNotNull(foundedAccount);
		Assert.assertTrue(createdAccount.equalsByFields(foundedAccount));
		
		// Update
		foundedAccount.setEmail(testEmailForUpdate);
		Account updatedAccount = updateAccount(foundedAccount);
		Assert.assertTrue(foundedAccount.equalsByFields(updatedAccount));
		
		// Delete
		deleteAccountById(updatedAccount.getId());
		Account deletedAccount = findAccountById(updatedAccount.getId());
		Assert.assertNull(deletedAccount);
	}
	
	public Account createAccount (Account account) {
		
		return accountRepository.create(account);
	}
	
	public Account findAccountById (Object id) {
		
		return accountRepository.findById(id);
	}
	
	public Account updateAccount (Account account) {
		
		return accountRepository.update(account);
	}
	
	public void deleteAccountById (Object id) {
		
		accountRepository.deleteById(id);
	}
	
	@Test
	public void findAccountByUsernameTest () {
		
		// Create
		Account createdAccount = createAccount(testAccount);
		Assert.assertNotNull(createdAccount.getId());
		
		// Find by username
		Account foundedAccount = accountRepository.findAccountByUsername(createdAccount.getUsername());
		Assert.assertNotNull(foundedAccount);
		Assert.assertTrue(createdAccount.equalsByFields(foundedAccount));
		
		// Delete
		deleteAccountById(foundedAccount.getId());
		Account deletedAccount = findAccountById(foundedAccount.getId());
		Assert.assertNull(deletedAccount);
	}
	
	@Test
	public void findAccountByEmailTest () {
		
		// Create
		Account createdAccount = createAccount(testAccount);
		Assert.assertNotNull(createdAccount.getId());
		
		// Find by email
		Account foundedAccount = accountRepository.findAccountByEmail(createdAccount.getEmail());
		Assert.assertNotNull(foundedAccount);
		Assert.assertTrue(createdAccount.equalsByFields(foundedAccount));
		
		// Delete
		deleteAccountById(foundedAccount.getId());
		Account deletedAccount = findAccountById(foundedAccount.getId());
		Assert.assertNull(deletedAccount);
	}
}
