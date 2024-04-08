package com.day7;

public class Rectangle {
	// 필드
	int width;
	int length;
	
	// 생성자
	public Rectangle(int w, int l) {
		width = w;
		length = l;
	}
	
	public Rectangle() {
		
	}
	
	// 넓이 메소드
	public int recArea() {
		int area = width * length;
		return area;
	}
	
	// 둘레 메소드
	public int recRound() {
		int round = (width + length) * 2;
		return round;
	}
}
