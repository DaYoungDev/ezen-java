package com.day7;

public class CircleTest {

	public static void main(String[] args) {
		// 객체 생성
		Circle c = new Circle();
		
		// 멤버변수에 값을 직접 할당
		c.radius = 10;
		
		// 메소드 호출
		double area = c.findArea();
		System.out.println("원의 넓이 : " + area);
		
		double girth = c.findGirth();
		System.out.println("원의 둘레 : " + girth);
		System.out.println("원의 둘레 : " + c.findGirth());
		
	}

}
