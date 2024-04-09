package com.day8.six;

import java.util.Scanner;

class Calculator{
	// static method
	public static int add(int a, int b) {
		return a + b;
	}
	
	// instance method
	public int minus(int a, int b) {
		return a - b;
	}
}

public class CalculatorTest {
	public static void main(String[] args) {
		// 1. static method 호출 => 클래스명.메소드();
		int result = Calculator.add(25, 30);
		System.out.println("합 : " + result);
		
		// int a = Integer.parseInt("123");
		
		// 2. instance method 호출 => 객체 생성 후 참조변수.메소드()
		Calculator c = new Calculator();
		result = c.minus(40, 7);
		System.out.println("차 : " + result);
		
		//Scanner sc = new Scanner(System.in);
		// int b = sc.nextInt();
		
	}

}
