package com.app.employee;


public class FixedStack implements Stack {
	private Employee [] arr;
	private int nextIndex;
	
	public FixedStack() {
		this.arr  = new Employee[Stack.STACK_SIZE];
		this.nextIndex = 0;
	}
	
	public void push(Employee data) {
		if(nextIndex == Stack.STACK_SIZE) {
			System.out.println("STACK IS FULL!!");
			return;
		}
		
		arr[nextIndex++] = data;
		System.out.println("INSERTED VALUE : " + arr[nextIndex - 1]);
	}
	
	public Employee pop() {
		if(nextIndex == 0) {
			System.out.println("STACK IS EMPTY");
			return null;
		}
		
		nextIndex--;
		System.out.println("POPED VALUE : " + arr[nextIndex]);
		return arr[nextIndex];
	}
}
