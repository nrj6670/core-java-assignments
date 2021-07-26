package com.app.core;

public class Worker extends Employee {
	public Worker(int id, String name, String department) {
		super(id, name, department);
	}
	
	@Override
	public String toString() {
		return "(Worker) " + super.toString();
	}
}
