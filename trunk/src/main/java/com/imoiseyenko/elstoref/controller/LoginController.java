package com.imoiseyenko.elstoref.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.iservice.IAccountService;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private IAccountService accountService;

	@RequestMapping("")
	public String showLoginPage (Map<String, Object> model) {
		
		return "login";
	}
	
	@RequestMapping(value="doLogin", method=RequestMethod.GET)
	public String doLogin (@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		
		Account account = accountService.findAccountByUsername(username);
		if (account != null) {
			
			if (password.equals(account.getPassword())) {
				
				model.addAttribute(account);
				
				return "home";
			}
		}
		
		return "login";
	}
}
