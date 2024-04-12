package com.day9;

public class ClassArgsTest {
	public static double multiply(int a, double b) {
		return a * b;
	}
	
	// 매개변수가 클래스인 경우
	public static void func1(Circle c) {
		// 참조변수가 보이면 참조변수.
		// 참조변수.멤버
		double area = c.findArea();
		System.out.println("원 면적 : " + area);
	}

	// 반환타입이 클래스인 경우
	public static Circle func2() {
		// 반환타입이 Circle(클래스)이면 Circle객체 (해당 클래스의 객체)가 리턴
		Circle c = new Circle(5);
		return c;
	}
	
	
	public static void main(String[] args) {
		double d = multiply(10, 3.5);
		System.out.println(d);
		
		int n1 = 20;
		double n2 = 2.7;
		d = multiply(n1, n2);
		
		// 1. 매개변수가 클래스인 경우
		/*
		 메소드의 매개변수가 int이면 main()에서 int 값을 넣어준다
		 				String이면		 String값을 넣어준다
		 				Circle이면		 Circle값을 넣어준다
		 								 (new로 객체생성해서 넣는다)
		 */
		Circle c = new Circle(10);
		func1(c);
		
		// 또는
		func1(new Circle(20));
		
		// 2. 반환타입이 클래스인 경우
		Circle c2 = func2();
		double area = c2.findArea();
		System.out.println("원의 면적 : " + area);
	}

}
