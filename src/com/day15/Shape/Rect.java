package com.day15.Shape;

public class Rect extends Shape{
	private int width;
	private int length;
	
	public Rect(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public double findGirth() {
		return 2 * (width + length);
	}
	
	public String toString() {
		return "사각형";
	}

	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	
	
}
