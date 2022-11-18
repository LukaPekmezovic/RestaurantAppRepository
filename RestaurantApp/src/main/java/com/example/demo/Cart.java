package com.example.demo;

import java.util.ArrayList;
import java.util.List;


public class Cart {
	
	private List<Food> foodList = new ArrayList();
	
	public String getFood() {
		return foodList.get(0).getFoodName();
	}
	
	public void addToCart(Food food) {
		foodList.add(food);
	}
	
	public void removeFromCart(Food food) {
		foodList.remove(food);
	}
}
