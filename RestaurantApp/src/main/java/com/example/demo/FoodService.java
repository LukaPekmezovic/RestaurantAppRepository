package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
	

	private final FoodRepository foodRepository;
	
	@Autowired
	FoodService(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}

	public void addFood(Food food) {
		foodRepository.save(food);
	}

	public List<Food> getAllFood() {
		return foodRepository.findAll();
	}

	public Food getFood(Long id) {
		return foodRepository.getReferenceById(id);
	}
	
}