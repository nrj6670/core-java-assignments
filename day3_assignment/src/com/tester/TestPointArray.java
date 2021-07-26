package com.tester;

import com.geometry.Point2D;
import java.util.Scanner;

public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of points you want to plot : ");
		
		Point2D [] pointsArr = new Point2D[sc.nextInt()];
		
		boolean stopLoop = false;
		
		do {
			
			System.out.println("\n\n1. Plot a new point\n2. Display all points plotted so far\n3. Test equality of two points\n4. Calculate distance\n10. Exit\n\nENTER YOUR CHOICE");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.print("\nEnter index of the array where you want to insert this new point : ");
					int index = sc.nextInt();
					if(index < pointsArr.length) {
						System.out.println("Enter x and y coordinate : ");
						pointsArr[index] = new Point2D(sc.nextInt(), sc.nextInt());
					} else {
						System.out.println("Entered index is out of the range of the array");
					}
					break;
					
				case 2:
					System.out.println("\nAll the points plotted so far : ");
					for(Point2D p : pointsArr) {
						if(p != null) {
							System.out.println(p.getDetails());
						}
					}
					break;
				
				case 3:
					System.out.print("\nEnter index of first point : ");
					int firstIndex = sc.nextInt();
					System.out.print("Enter index of second point : ");
					int secondIndex = sc.nextInt();
					if(firstIndex < pointsArr.length && secondIndex < pointsArr.length) {
							if(pointsArr[firstIndex] == null) {
								System.out.println("First index has not been plotted yet.");
							} else if(pointsArr[secondIndex] == null) {
								System.out.println("Second index has not been plotted yet");
							} else {
								if(pointsArr[firstIndex].isEqual(pointsArr[secondIndex])) {
									System.out.println("Both points are equal.");
								} else {
									System.out.println("Both points are different");
								}
							}
						
					} else {
						System.out.println("Invalid indices. Out of array range.");
					}
					break;
				case 4:
					System.out.print("\nEnter index of first point : ");
					int start = sc.nextInt();
					System.out.print("Enter index of second point : ");
					int end = sc.nextInt();
					
					if(start < pointsArr.length && end < pointsArr.length) {
						if(pointsArr[start] == null) {
							System.out.println("First index has not been plotted yet.");
						} else if(pointsArr[end] == null) {
							System.out.println("Second index has not been plotted yet");
						} else {
							System.out.println("Distance = " + pointsArr[start].calculateDistance(pointsArr[end]));
						}
					} else {
						System.out.println("Invalid indices. Out of array range.");
					}
					break;
				
				case 10: 
					stopLoop = true;
					System.out.println("Program exited");
					break;
			
				default: 
					System.out.println("Invalid choice");
			}
		}while(!stopLoop);
		
		sc.close();
	}

}
