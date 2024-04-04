package com.day5;

import java.util.Scanner;

public class MethodTest3 {
	public static int minus(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public static void main(String[] args) {
		// 메소드 호출
		// 1. 직접 값을 넣어준다
		int result = minus(30, 10);
		System.out.println(result);
		
		// 2. 변수에 값을 넣어서 넘겨준다.
		int n1 = 50, n2 = 20;
		result = minus(n1, n2);
		System.out.println(result);
		
		// 3. 사용자 입력을 받아서 넘겨준다.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 2개 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		result = minus(num1, num2);
		System.out.println(result);
		
		
		//int Integer.parseInt(String s)
		int a = Integer.parseInt("123");
		
		String str = "4567";
		a = Integer.parseInt(str);
		
		
	}

}
