package com.sales.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.domain.Item;
import com.sales.services.ItemService;

@Controller
public class ItemResource {


	
	@Autowired
	private ItemService  itemService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Item obj = itemService.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
