package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private Category cat;
	private double price;
	private String author;
	private LocalDate publishDate;
	private int quantity;
	
	public Book(String title, Category cat, double price, String author, LocalDate dt, int quantity) {
		this.title = title;
		this.cat = cat;
		this.price = price;
		this.author = author;
		this.publishDate = dt;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "[title=" + this.title+", category=" + this.cat + ", price=" + this.price
				+ ", author=" + this.author + ", publish date=" + this.publishDate
				+ ", quantity=" + this.quantity+"]";
	}
	
	@Override
	public boolean equals(Object anotherBook) {
		if(anotherBook == this) {
			return true;
		}
		if(anotherBook instanceof Book) {
			return this.title.equals(((Book)anotherBook).title);
		}
		return false;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public Category getCat() {
		return cat;
	}

	public String getAuthor() {
		return author;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
}
