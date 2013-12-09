package com.imoiseyenko.elstoref.controller.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imoiseyenko.elstoref.iservice.IPlayerService;

@Controller
@RequestMapping("catalog/player")
public class PlayerController {

	private static final String CATALOG_NAME = "Player catalog";
	
	@Autowired
	private IPlayerService playerService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showPlayerCatalogPage (Model model) {
		
		model.addAttribute("catalogName", CATALOG_NAME);
		model.addAttribute("inventoryItemList", playerService.findAllPlayers());
		
		return "inventory_item_catalog";
	}
}
