package com.day9.seven;

import java.util.Scanner;

class Shape1{
	public double findArea() {
		return 0;
	}
}

class Circle1 extends Shape1{
	private int radius;
	
	public Circle1(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double findArea() {
		return radius * radius * 3.14;
	}
}

class Rectangle extends Shape{
	private int width;
	private int length;
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public double findArea() {
		return width * length;
	}
}

public class OverridingExam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하세요");
		int radius = sc.nextInt();
		
		Circle1 c = new Circle1(radius);
		System.out.println("원의 면적 : " + c.findArea());
		
		System.out.println("사각형의 가로와 세로를 입력하세요.");
		int width = sc.nextInt();
		int length = sc.nextInt();
		
		Rectangle r = new Rectangle(width, length);
		System.out.println("사각형의 면적 : " + r.findArea());
	}

}
