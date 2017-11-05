package com.shanky.springboot.table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TableController {
	
	@Autowired
	private TableService tableService;
	
	@RequestMapping("/table")
	public List<TableInfo> getAllTables(){
		return tableService.getAllTables();
	}
	
	@RequestMapping("/table/{id}")
	public TableInfo getTable(@PathVariable Integer id){
		return tableService.getTable(id);		
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/table")
	public void addTable(@RequestBody TableInfo table) {
		tableService.addTable(table);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/table/{id}")
	public void updateTable(@RequestBody TableInfo table, @PathVariable Integer id)
	{
		tableService.updateTable(id, table);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/table/{id}")
	public void deleteTable(@PathVariable Integer id)
	{
		tableService.deleteTable(id);
	}

}
