package com.geometry;

public class Point2D {
	private int x, y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		String detail = "(" + this.x +", " + this.y + ")";
		return detail;
	}

	public boolean isEqual(Point2D anotherPoint) {
		return this.x == anotherPoint.x && this.y == anotherPoint.y;
	}

	public Point2D createNewPoint(int x, int y) {
		return new Point2D(this.x + x, this.y + y);
	}

	public double calculateDistance(Point2D anotherPoint) {
		double temp = Math.pow((this.x - anotherPoint.x), 2) + Math.pow((this.y - anotherPoint.y), 2);
		return Math.sqrt(temp);
	}
}