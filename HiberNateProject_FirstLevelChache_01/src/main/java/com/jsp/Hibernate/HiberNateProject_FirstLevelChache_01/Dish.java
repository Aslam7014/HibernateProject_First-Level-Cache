package com.jsp.Hibernate.HiberNateProject_FirstLevelChache_01;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dish {
	@Id
	private int dishId;
	private String dishName;
	private int dishPrice;
	
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}
	
	
	
}
