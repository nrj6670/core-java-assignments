package com.app.tester;

import com.app.core.Box;
import java.util.Scanner;

public class BoxTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of boxes : ");
		Box [] boxArr = new Box[sc.nextInt()];
		
		for(int i=0; i<boxArr.length; i++) {
			System.out.println("Enter dimensions (width, depth and length) for box " + (i+1) + " :- ");
			boxArr[i] = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		
		for(Box b : boxArr) {
			if(b.getBoxVolume() > 100) {
				System.out.println("The volume of the box with " + b.getBoxDetails() + " is greater than 100 cubic units.");
				b.doubleTheWidth();
				System.out.println(b.getBoxDetails() + " is the new changed dimensions of the box.\n");
			}
		}
		
		sc.close();
	}
}
