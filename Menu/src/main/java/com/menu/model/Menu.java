package com.menu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Menu 
{
	@Id
	private Long mId;
	private String dish;
	private String description;
	private Long price;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(Long mId, String dish, String description, Long price) {
		super();
		this.mId = mId;
		this.dish = dish;
		this.description = description;
		this.price = price;
	}
	public Long getmId() {
		return mId;
	}
	public void setmId(Long mId) {
		this.mId = mId;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
}
