package tester;

import java.util.Scanner;
import com.geometry.Point2D;

class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x and y coordinate for first point : ");
		Point2D p1 = new Point2D(sc.nextInt(), sc.nextInt());
		System.out.println("Enter x and y coordinate for second point : ");
		Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());

		System.out.println("p1 = " + p1.getDetails() + " and p2 = " + p2.getDetails());

		if(p1.isEqual(p2)) {
			System.out.println("Both points are same.");
		} else {
			System.out.println("Point p1 and p2 are different.");
		}
		System.out.println("Enter offset (x,y) to get a new point p3 from p1 : ");
		Point2D p3 = p1.createNewPoint(sc.nextInt(), sc.nextInt());
		System.out.println("p3 = " + p3.getDetails());

		System.out.printf("Distance between points p1 and p2 = %.2f", p1.calculateDistance(p3));
		
		sc.close();
	}
}