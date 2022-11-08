package com.menu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.menu.model.Menu;

public interface Menurepository extends MongoRepository<Menu, Long>{

}
