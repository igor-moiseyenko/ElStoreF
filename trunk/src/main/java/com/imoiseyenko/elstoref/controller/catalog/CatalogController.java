package com.imoiseyenko.elstoref.controller.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imoiseyenko.elstoref.iservice.ICategoryNameService;
import com.imoiseyenko.elstoref.iservice.IInventoryItemNameService;

@Controller
@RequestMapping("catalog")
public class CatalogController {

	@Autowired
	private ICategoryNameService categoryNameService;
	
	@Autowired
	private IInventoryItemNameService inventoryItemNameService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showCatalogPage (Model model) {
		
		model.addAttribute(categoryNameService.findAllCategoryNames());
		
		return "catalog";
	}
}
