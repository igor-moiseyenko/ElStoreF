package com.imoiseyenko.elstoref.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController () {}
	
	@RequestMapping( { "/", "/home" } )
	public String showHomePage (Map<String, Object> model) {
		
		return "home";
	}
}
