package com.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menu.model.Menu;
import com.menu.repository.Menurepository;
import com.menu.service.Menuservice;

@RestController
@RequestMapping("/menu")
public class Menucontroller 
{
	@Autowired
	private Menuservice service; 
	@Autowired
	private Menurepository repo;
	
	@PostMapping("/add")
	public ResponseEntity<Menu> addAll(@RequestBody Menu cus)
	{
		return ResponseEntity.ok(((CrudRepository<Menu, Long>) repo).save(cus));
	}
	
	@RequestMapping("/{mid}")
	public Menu getdetails(@PathVariable ("mid") Long id)
	{
		Menu m = service.getMenu(id);
		return m;
	}
}
