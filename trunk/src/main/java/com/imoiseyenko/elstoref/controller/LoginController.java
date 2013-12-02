package com.imoiseyenko.elstoref.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.iservice.IAccountService;

@Controller
public class LoginController {
	
	@Autowired
	private IAccountService accountService;

	@RequestMapping("login")
	public String showLoginPage (Map<String, Object> model) {
		
		return "login";
	}
	
	@RequestMapping(value="doLogin", method=RequestMethod.GET)
	public String doLogin (@RequestParam("username") String username, @RequestParam("password") String password) {
		
		Account account = accountService.findAccountByUsername(username);
		if (account != null) {
			
			if (password.equals(account.getPassword())) {
				
				return "home";
			}
		}
		
		return "login";
	}
}
