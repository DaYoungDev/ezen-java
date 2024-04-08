package com.day7;

public class Calculator {
	// 필드 없음
	
	// 메소드
	// 1. 더하기
	public void puls(double a, double b) {
		double result = a + b;
		System.out.println("a + b = " + result);
	}
	
	// 2. 빼기
	public void minus(double a, double b) {
		double result = a - b;
		System.out.println("a - b = " + result);
	}
	
	// 3. 곱하기
	public void multiply(double a, double b) {
		double result = a * b;
		System.out.println("a * b = " + result);
	}
	
	// 4. 나누기
	public void divide(double a, double b) {
		double result = a / b;
		System.out.println("a / b = " + result);
	}
}
