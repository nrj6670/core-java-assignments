package com.app.core;

public class Manager extends Employee {
	public Manager(int id, String name, String department) {
		super(id, name, department);
	}
	
	@Override
	public String toString() {
		return "(Manager) " + super.toString();
	}
}
