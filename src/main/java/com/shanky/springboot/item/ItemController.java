package com.shanky.springboot.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@RequestMapping("/item/{id}")
	public Item getItem(@PathVariable Integer id){
		return itemService.getItems(id);		
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/item")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/item/{id}")
	public void Topic(@RequestBody Item item, @PathVariable Integer id)
	{
		itemService.updateItem(id, item);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
	public void deleteTopic(@PathVariable Integer id)
	{
		itemService.deleteItem(id);
	}

}
