package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cart")
public class CartController {
	
	private final FoodService foodService;
	
	@Autowired
	public CartController(FoodService foodService){
		this.foodService = foodService;
	}
	
	Cart cart = new Cart();
	
	@GetMapping
	public String getListOfFood(){
		return cart.getFood();
	}
	
	@PostMapping
	public void addFoodToCart(@RequestParam Long id) {
		Food food = foodService.getFood(id);
		cart.addToCart(food);
	}
	
	@DeleteMapping
	public void removeFoodFromCart(@RequestBody Food food) {
		cart.removeFromCart(food);
	}
	
}
