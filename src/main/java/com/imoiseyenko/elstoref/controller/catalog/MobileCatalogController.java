package com.imoiseyenko.elstoref.controller.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imoiseyenko.elstoref.iservice.IMobilePhoneService;

@Controller
@RequestMapping("catalog/mobile")
public class MobileCatalogController {

	private static final String CATALOG_NAME = "Mobile catalog";
	private static final String CATALOG_URL ="/catalog/mobile";
	
	@Autowired
	private IMobilePhoneService mobilePhoneService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showMobileCatalogPage (Model model) {
		
		model.addAttribute("catalogName", CATALOG_NAME);
		model.addAttribute("catalogUrl", CATALOG_URL);
		model.addAttribute("inventoryItemList", mobilePhoneService.findAllMobilePhones());
		
		return "inventory_item_catalog";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String showMobileDetailsPage (@PathVariable Long id, Model model) {
		
		model.addAttribute("mobile", mobilePhoneService.findMobilePhoneById(id));
		
		return "mobile_details";
	}
}
