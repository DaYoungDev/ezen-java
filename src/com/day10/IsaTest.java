package com.day10;

class Point{
	protected int x;
	protected int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle extends Point{
	private int r;
	
	Circle(int x, int y, int r){
		super(x, y);
		this.r = r;
	}
	
	public void printInfo() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("r = " + r + "\n");
	}
}
public class IsaTest {
	public static void main(String[] args) {
		Circle c = new Circle(5, 7, 10);
		c.printInfo();
	}

}
