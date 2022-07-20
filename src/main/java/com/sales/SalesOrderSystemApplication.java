package com.sales;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sales.domain.Item;
import com.sales.domain.OrderDetail;
import com.sales.domain.Orderr;
import com.sales.repositories.ItemRepository;
import com.sales.repositories.OrderDetailRepository;
import com.sales.repositories.OrderrRepository;

@SpringBootApplication
public class SalesOrderSystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SalesOrderSystemApplication.class, args);
	}
	
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	OrderDetailRepository orderDetailRepository;
	@Autowired
	OrderrRepository orderrRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
		Orderr orderr = new Orderr(null, sdf.parse("05/12/2022 12:30" ));
		Orderr orderr2 = new Orderr(null, sdf.parse("25/12/2022 10:30" ));
		
		orderrRepository.saveAll(Arrays.asList(orderr, orderr2));
		
		OrderDetail ord = new OrderDetail(null, 2, "CREATED", orderr);
		OrderDetail ord2 = new OrderDetail(null, 3, "CREATED", orderr2);
		
		orderDetailRepository.saveAll(Arrays.asList(ord, ord2));
		
		Item item = new Item(null, 23.5, "Bicicleta infantíl Caloi", ord);
		Item item2 = new Item(null, 0.8, "Iphone 13 pro max", ord2);
		
		
		ord.getItems().addAll(Arrays.asList(item, item2));
		
		itemRepository.saveAll(Arrays.asList(item, item2));
		
		
		

		
	}

}
