package com.imoiseyenko.elstoref.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

	public AboutController () {}
	
	@RequestMapping( "/about" )
	public String showAboutPage (Map<String, Object> model) {
		
		return "about";
	}
}
