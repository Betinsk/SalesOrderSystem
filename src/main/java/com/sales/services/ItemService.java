package com.sales.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.domain.Item;
import com.sales.exceptions.ObjectNotFoundException;
import com.sales.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public Item find(Integer id) { 
		 Optional<Item> obj = itemRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Item.class.getName())); 
		}
	
	
	
}
