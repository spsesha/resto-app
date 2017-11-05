package com.shanky.springboot.restaurent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@RequestMapping("/restaurant")
	public List<Restaurant> getAllRestaurants(){
		return restaurantService.getAllRestaurants();
	}
	
	@RequestMapping("/restaurant/{id}")
	public Restaurant getRestaurant(@PathVariable Integer id){
		return restaurantService.getRestaurant(id);		
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/restaurant")
	public void addRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/restaurant/{id}")
	public void updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable Integer id)
	{
		restaurantService.updateRestaurant(id, restaurant);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/restaurant/{id}")
	public void deleteRestaurant(@PathVariable Integer id)
	{
		restaurantService.deleteRestaurant(id);
	}

}
