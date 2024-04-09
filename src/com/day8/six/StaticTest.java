package com.day8.six;

public class StaticTest {
	private int num1 = 10; // 인스턴스 변수
	private static int num2 = 20; // static 변수
	
	public int add() { // 인스턴스 메소드
		return num1 + num2;
	}
	
	public static int multiply(int a, int b) {
		//int c = num1 * num2; // error : static 메소드에서는 static만 접근가능
		
		return a*b;
	}
	public static void main(String[] args) {
		// main도 static 메소드
		int result = multiply(5, 9);
		// => static 메소드 호출 : 클래스명.메소드() => 같은 클래스이므로
		// 클래스명 생략하고 메소드만 호출가능
		
		//result = add(); // error
		//Cannot make a static reference to the non-static method add() from the type StaticTest
		// static 메소드는 static 데이터만 접근 가능
		// non-static 데이터는 인스턴스화 시킨 후 접근해야함
		StaticTest obj = new StaticTest();
		result = obj.add();
		System.out.println("더하기 : " + result);
	}

}
