package com.imoiseyenko.elstoref.controller.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imoiseyenko.elstoref.iservice.ILaptopService;

@Controller
@RequestMapping("catalog/laptop")
public class LaptopCatalogController {

	private static final String CATALOG_NAME = "Laptop catalog";
	private static final String CATALOG_URL ="/catalog/laptop";
	
	@Autowired
	private ILaptopService laptopService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showLaptopCatalogPage (Model model) {
		
		model.addAttribute("catalogName", CATALOG_NAME);
		model.addAttribute("catalogUrl", CATALOG_URL);
		model.addAttribute("inventoryItemList", laptopService.findAllLaptops());
		
		return "inventory_item_catalog";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String showLaptopDetails (@PathVariable Long id, Model model) {
		
		model.addAttribute("item", laptopService.findLaptopById(id));
		
		return "inventory_item_details";
	}
}
