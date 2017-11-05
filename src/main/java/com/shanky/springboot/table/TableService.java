package com.shanky.springboot.table;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {

	@Autowired
	private TableRepository tableRepository;
	
	public List<TableInfo> getAllTables(){
		List<TableInfo> tables = new ArrayList<>();
		tableRepository.findAll().forEach(tables::add);
		return tables;
	}

	public TableInfo getTable(Integer id) {
		return tableRepository.findOne(id);
	}

	public void addTable(TableInfo item) {
		tableRepository.save(item);
		
	}

	public void updateTable(Integer id, TableInfo item) {
		tableRepository.save(item);
		
	}

	public void deleteTable(Integer id) {
		tableRepository.delete(id);
		
	}
	
}
