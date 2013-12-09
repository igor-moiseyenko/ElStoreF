package com.imoiseyenko.elstoref.controller.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imoiseyenko.elstoref.iservice.ILaptopService;

@Controller
@RequestMapping("catalog/laptop")
public class LaptopCatalogController {

	private static final String CATALOG_NAME = "Laptop catalog";
	
	@Autowired
	private ILaptopService laptopService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showLaptopCatalogPage (Model model) {
		
		model.addAttribute("catalogName", CATALOG_NAME);
		model.addAttribute(laptopService.findAllLaptops());
		
		return "laptop_catalog";
	}
}
