package com.app.employee;

public class GrowableStack implements Stack {
	private int capacity;
	private Employee [] arr;
	private int nextIndex;
	
	public GrowableStack() {
		this.capacity = Stack.STACK_SIZE;
		this.arr = new Employee[capacity];
		this.nextIndex = 0;
	}
	
	public void push(Employee data) {
		if(nextIndex == capacity) {
			System.out.println("Array is full....Doubling its size...");
			Employee [] tempArr = new Employee[2 * capacity];
			
			for(int i=0; i<capacity; i++) {
				tempArr[i] = arr[i];
			}
			
			capacity = 2 * capacity;
			arr = tempArr;
			System.out.println("Array size has been doubled");
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
		System.out.println("POPED OUT VALUE : " + arr[nextIndex]);
		return arr[nextIndex];
	}
}
