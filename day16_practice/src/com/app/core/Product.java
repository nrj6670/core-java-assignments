package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private double price;
	private Category category;
	private LocalDate manufacturingDate;
	
	public Product(int id, String name, double price, Category category, LocalDate manuDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.manufacturingDate = manuDate;
	}
	
	@Override
	public String toString() {
		return "Product : ID = " + this.id + ", Name = " + this.name + ", Category = " 
				+ this.category + ", Manufaturing date = " + this.manufacturingDate 
				+ ", Price = " + this.price + "\n";
	}
	
	public int getProductId() {
		return this.id;
	}
}
