package com.shanky.springboot.item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems(){
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}

	public Item getItems(Integer id) {
		return itemRepository.findOne(id);
	}

	public void addItem(Item item) {
		itemRepository.save(item);
		
	}

	public void updateItem(Integer id, Item item) {
		itemRepository.save(item);
		
	}

	public void deleteItem(Integer id) {
		itemRepository.delete(id);
		
	}
	
}
