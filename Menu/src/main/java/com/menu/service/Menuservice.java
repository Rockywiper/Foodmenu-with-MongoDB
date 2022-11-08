package com.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menu.model.Menu;
import com.menu.repository.Menurepository;

@Service
public class Menuservice 
{
	@Autowired
	private Menurepository repo;
	
	public Menu getMenu(Long mid) 
	{
		List<Menu> users = repo.findAll();
		return users.stream().filter(customer -> customer.getmId().equals(mid)).findAny().orElse(null);
	}
}
