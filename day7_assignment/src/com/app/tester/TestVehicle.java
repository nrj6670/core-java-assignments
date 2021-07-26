package com.app.tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details of first vehicle (Registraion number, color, price) : ");
		Vehicle v1 = new Vehicle(sc.nextLine(), sc.nextLine(), sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter details of second vehicle (Registraion number, color, price) : ");
		Vehicle v2 = new Vehicle(sc.nextLine(), sc.nextLine(), sc.nextDouble());
		
		if(v1.equals(v2)) {
			System.out.println("Both vehicles are SAME");
		} else {
			System.out.println("Both vehicles are DIFFERENT");
		}
		
		sc.close();
	}

}
