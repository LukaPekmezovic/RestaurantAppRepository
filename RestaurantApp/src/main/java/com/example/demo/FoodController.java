package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/food")
public class FoodController {

	private final FoodService foodService;
	
	@Autowired
	public FoodController(FoodService foodService) {
		this.foodService = foodService;
	}
	
	@GetMapping
	public List<Food> getAllFood() {
		return foodService.getAllFood();
	}
	
	@PostMapping
	public void addFood(@RequestBody Food food) {
		foodService.addFood(food);
		
	}
}