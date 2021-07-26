package com.app.customer;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationNumber;
	private Date dob;
	private CustomerType type;
	
	public static SimpleDateFormat s;
	
	static {
		s = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Customer(String name, String email, String password, double rAmnt, Date dob, CustomerType type) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationNumber = rAmnt;
		this.dob = dob;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Customer : Name = " + this.name + ", Email = " + this.email + ", D.O.B = " + s.format(dob) + ", Registraion number = " + this.registrationNumber + ", Memebership type = " + this.type;
	}
}	
