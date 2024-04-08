package com.day7;

public class Circle2 {
	// 1. 멤버변수(필드)
	int radius; // 반지름
	
	// 2. 생성자 - 멤버변수의 값 초기화
	public Circle2(int r) {
		radius = r;
	}
	
	// 3. 메소드
	// 3-1. 넓이 구하는 메소드
	public double findArea() {
		double area = radius * radius * 3.14;
		return area;
	}
	
	// 3-2. 둘레를 구하는 메소드
	public double findGirth() {
		double girth = radius * 2 * Math.PI;
		return girth;
	}
}
