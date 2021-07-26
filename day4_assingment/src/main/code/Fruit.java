package main.code;

public class Fruit {
	private String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public void taste() {
		System.out.println("Taste unknown for : " + name); 
	}
}
