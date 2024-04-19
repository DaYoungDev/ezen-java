package com.day15.Shape;

public class Circle extends Shape{
	private int radius;
	private final static double PI = 3.14;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double findGirth() {
		return radius * 2 * PI;
	}
	
	public String toString() {
		return "원";
	}

	public int getRadius() {
		return radius;
	}
	
}
