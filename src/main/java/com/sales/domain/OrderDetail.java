package com.sales.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderDetail implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantity;
	private String taxStatus;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private List<Item> items = new ArrayList<>();
	
	@OneToOne
	private Orderr orderr;
	

	public OrderDetail() {
	}

	
	public OrderDetail(Integer id, Integer quantity, String taxStatus, Orderr orderr) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.taxStatus = taxStatus;
		this.orderr = orderr;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}


	public Orderr getOrder() {
		return orderr;
	}

	public void setOrder(Orderr order) {
		this.orderr = order;
	}
	
	
	
}
