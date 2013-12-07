package com.imoiseyenko.elstoref.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imoiseyenko.elstoref.domain.Account;
import com.imoiseyenko.elstoref.iservice.IAccountService;

@Controller
@RequestMapping("register")
public class RegisterController {

	@Autowired
	private IAccountService accountService;

	@RequestMapping(method = RequestMethod.GET)
	public String showRegisterPage (Model model) {
		
		model.addAttribute(new Account());
		
		return "register";
	}
	
	@RequestMapping(value = "doRegister", method = RequestMethod.POST)
	public String doRegister (@Valid Account account, BindingResult bindingResult) {
		
		// Check for errors
		if (bindingResult.hasErrors()) {
			
			return "register";
		}
		
		if (accountService.findAccountByUsername(account.getUsername()) == null) {
			
			if (accountService.findAccountByEmail(account.getEmail()) == null) {
				
				accountService.createAccount(account);
			}
			else {
				
				return "register";
			}
		}
		else {
			
			return "register";
		}

		return "home";
	}
}
