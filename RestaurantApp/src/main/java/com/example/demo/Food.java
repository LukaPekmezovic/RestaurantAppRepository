package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;


@Entity
@Proxy(lazy = false)
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String foodName;
	private int foodPrice;
	
	public Food(){
		
	}
	
	public Food(String foodName, int foodPrice) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	
	public Food(Long id, String foodName, int foodPrice) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public Long getId() {
		return id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	
	
}

	
