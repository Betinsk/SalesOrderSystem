package com.sales.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Item implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double weight;
	private String description;
	
	@ManyToOne()
	@JoinColumn(name="orderDetail_id")
	private OrderDetail orderDetail;
	
	
	public Item() {
	}
	
	public Item(Integer id, Double weight, String description, OrderDetail orderDetail) {
		super();
		this.id = id;
		this.weight = weight;
		this.description = description;
		this.orderDetail = orderDetail;
	}

	public Double getWeight() {
		return weight;
	}
	

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", weight=" + weight + ", description=" + description + "]";
	}
	
	
		
		
	
	
	
}
