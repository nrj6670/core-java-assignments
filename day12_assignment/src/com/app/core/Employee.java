package com.app.core;

public class Employee {
	private int id;
	private String name;
	private String department;
	
	public Employee(int id, String name , String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee : " + "ID = " + this.id + ", NAME = " + this.name + ", DEPARTMENT = " + this.department; 
	}
}
