package com.app.core;

public class SalesManager extends Manager {
	public SalesManager(int id, String name, String department) {
		super(id, name, department);
	}
	
	@Override
	public String toString() {
		return "(Sales manager) " + super.toString();
	}
}
