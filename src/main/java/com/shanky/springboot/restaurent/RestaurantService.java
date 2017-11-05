package com.shanky.springboot.restaurent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public List<Restaurant> getAllRestaurants(){
		List<Restaurant> restaurants = new ArrayList<>();
		restaurantRepository.findAll().forEach(restaurants::add);
		return restaurants;
	}

	public Restaurant getRestaurant(Integer id) {
		return restaurantRepository.findOne(id);
	}

	public void addRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
		
	}

	public void updateRestaurant(Integer id, Restaurant restaurant) {
		restaurantRepository.save(restaurant);
		
	}

	public void deleteRestaurant(Integer id) {
		restaurantRepository.delete(id);
		
	}
	
}
