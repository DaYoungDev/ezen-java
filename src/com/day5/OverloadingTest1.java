package com.day5;

public class OverloadingTest1 {
	/*
	 오버로딩 메소드(overloading method)
	 하나의 동일한 클래스내에서 동일한 이름을 가진 메소드
	 단, 매개변수의 개수나 자료형이 달라야 함
	 */

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int add(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static double add(double a, double b) {
		double c = a + b;
		return c;
	}
	
	// 오버로딩 메소드가 아님! - 리턴타입으로 구별 안함
	/*
	public static String add(int a, int b) {
		String c = Integer.toString(a + b);
		return c;
	}
	*/
	
	public static void main(String[] args) {

		int result = add(10, 20);
		System.out.println(result);
		
		result = add(10, 20, 30);
		System.out.println(result);
		
		double res = add(3.14, 5.6);
		System.out.println(res);
	}

}
