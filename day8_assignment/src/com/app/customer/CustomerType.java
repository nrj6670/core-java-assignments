package com.app.customer;

public enum CustomerType {
	SILVER, GOLD, PLATINUM;
	
	@Override
	public String toString() {
		return "Customer type : " + name();
	}
}
