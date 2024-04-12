package com.day9;

public class Circle {
	// 멤버변수(필드)
	int radius; // 반지름
	
	// 생성자
	public Circle(int radius){
		this.radius = radius;
	}
	
	// 메소드
	// 넓이 구하는 메소드
	public double findArea() {
		double area = radius * radius * 3.14;
		return area;
	}
	
	// 둘레를 구하는 메소드
	public double findGirth() {
		double girth = radius * 2 * Math.PI;
		return girth;
	}
}
