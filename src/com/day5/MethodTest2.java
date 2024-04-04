package com.day5;

public class MethodTest2 {
	
	// [1] 매개변수도 없고, 반환값도 없는 메소드 정의
	public static void func1() {
		System.out.println("******");
	}
	
	// [2] 매개변수는 있고, 반환값은 없는 메소드 정의
	public static void func2(int cnt) {
		// 입력받은 개수만큼 별 출력하는 기능
		for(int i = 0; i < cnt; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	// [3] 매개변수는 없고, 반환값은 있는 메소드 정의
	public static double func3() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		double avg = sum / 10.0;
		return avg; // return 해주는 값(avg)의 자료형이 double이므로
		// func3 메소드의 반환타입은 double
	}
	
	// [4] 매개변수도 있고, 반환값도 있는 메소드 정의
	public static int func4(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		// 1. 매개변수도 없고, 반환값도 없는 메소드 호출
		func1();
		
		// 2. 매개변수는 있고, 반환값은 없는 메소드 호출
		func2(3);
		
		// 3. 매개변수는 있고, 반환값은 없는 메소드 호출
		double d = func3();
		System.out.println(d);
		
		// 4. 매개변수는 있고, 반환값도 있는 메소드 호출
		int n = func4(10, 20);
		System.out.println(n);
	}

}
