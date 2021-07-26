package com.app.vehicles;

public class Vehicle {
	private String registrationNum;
	private String color;
	private double price;
	
	public Vehicle(String registraionNum, String color, double price) {
		this.registrationNum = registraionNum;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle : Registraion No. : " + this.registrationNum + ", Color : " + this.color + ", Price : " + this.price;
	}
}
