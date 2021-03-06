package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

//Book class implemeting Serializable interface to convert its state to byte stream 
//and the state can be obtained back through deserialization

public class Book implements Serializable{
	/**
	 * 
	 */
	//default serial id
	private static final long serialVersionUID = 1L;
	
	//data members
	private String title;
	private String author;
	private Category category;
	private double price;
	private LocalDate publishDate;
	
	public Book(String title, String author, Category category, double price, LocalDate publishDate) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
	}
	
	@Override
	public String toString() {
		return "| Title : " + this.title + ", Author : " + this.author + ", Category : " + this.category
				+ ", Price : " + this.price + ", Publish date : " + this.publishDate + " |";
	}
	
	//overriding equals method
	@Override
	public boolean equals(Object anotherBook) {
		if(anotherBook == null) {
			return false;
		}
		
		if(anotherBook instanceof Book) {
			//if the reference of invoker object and anotherBook object are same, than returning true
			if(this == anotherBook) {
				return true;
			}
			
			//using equals method with title to compare the string value of both the objects
			if(this.title.equals(((Book)anotherBook).title)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 29;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	public String getBookTitle() {
		return this.title;
	}
	
	public double getBookPrice() {
		return this.price;
	}
}
