package com.app.core;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Book {
	private String title;
	private Category cat;
	private double price;
	private Date publishDate;
	private String authorName;
	private int qty;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
	
	public Book(String title, Category cat, double price, Date dt, String authorName, int qty) {
		this.title = title;
		this.cat = cat;
		this.price = price;
		this.publishDate = dt;
		this.authorName = authorName;
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "[Title=" + this.title + ", Category=" + this.cat + ", Author=" + this.authorName + ", Price=" + this.price + ", Publish date=" + sdf.format(this.publishDate) + ", Quantity=" + this.qty + "]";
	}
	
	@Override
	public boolean equals(Object anotherObject) {
		if(this.title.equals(anotherObject)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 23;
		int result = 2;
		result = result * prime + ((this.title == null) ? 0 : this.title.hashCode());
		return result;
	}
	
	public void setQuantity(int qty) {
		this.qty += qty;
	}
	
	public String getBookTitle() {
		return this.title;
	}
}
