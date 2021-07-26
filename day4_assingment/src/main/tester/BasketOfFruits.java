package main.tester;

import main.code.Fruit;
import main.code.Apple;
import main.code.Mango;
import main.code.Orange;

import java.util.Scanner;

public class BasketOfFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basker size : ");
		int s = sc.nextInt();
		
		Fruit [] basket = new Fruit[s];
		
		boolean stopLoop = false;
		int counter = 0;
		
		do {
			System.out.println("\n1. Add apple\n2. Add mango\n3. Add orange\n4. View basket contents\n5. Exit the program\n\nEnter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: 
					if(counter >= s) {
						System.out.println("Basket is full!!");
						break;
					}
					basket[counter++] = new Apple();
					break;
				case 2:
					if(counter >= s) {
						System.out.println("Basket is full!!");
						break;
					}
					basket[counter++] = new Mango();
					break;
				case 3:
					if(counter >= s) {
						System.out.println("Basket is full!!");
						break;
					}
					basket[counter++] = new Orange();
					break;
				case 4:
					for(Fruit f : basket) {
						if(f != null) {
							f.taste();
						}
					}
					break;
				case 5:
					stopLoop = true;
					System.out.println("Program exited");
					break;
				default:
				    System.out.println("Invalid input");
			}
			
		} while(!stopLoop);
		
		sc.close();
	}

}
