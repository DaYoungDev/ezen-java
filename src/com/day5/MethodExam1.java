package com.day5;

public class MethodExam1 {

	// 1. 매개변수, 반환값이 모두 없는 메소드 정의
	public static void func1() {
		System.out.println("Hello Java");
	}
	
	// 2. 매개변수가 있는 경우의 메소드 정의
	public static void func2(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println("Hello Java");
		}
	}

	// 3. 반환값이 있는 메소드 정의
	public static int func3() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if((i % 2) == 1) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	// 4. 매개변수, 반환값 모두 있는 경우
	public static double func4(double a, double b) {
		double result = a * b;
		return result;
	}
	public static void main(String[] args) {
		
		// 1. 매개변수, 반환값이 모두 없는 경우
		func1();
		System.out.println();
		
		// 2. 매개변수가 있는 경우
		func2(3);
		System.out.println();
		
		// 3. 반환값이 있는 경우
		int sum = func3();
		System.out.println("1~100까지의 홀수의 합 = " + sum);
		System.out.println();
		
		// 4. 매개변수, 반환값이 모두 있는 경우
		double a = 10.0;
		double b = 2.5;
		double result = func4(a, b);
		
		System.out.println(a + " * " + b + " = " + result);
		
	}

}
