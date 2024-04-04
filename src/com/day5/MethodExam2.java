package com.day5;

import java.util.Scanner;

public class MethodExam2 {
	
	// 1. 두 수 중 더 큰수를 구하는 메소드 정의
	public static int func1(int a, int b) {
		int result = (a > b)? a : b;
		return result;
	}
	
	// 2. 두 수의 나머지를 구하는 메소드 정의
	public static int func2(int a, int b) {
		int rest = a % b;
		return rest;
	}

	public static void main(String[] args) {
		// 1. 사용자로부터 받은 두 수 중 더 큰수를 구하는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 비교할 두 수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = func1(a, b);
		System.out.println("더 큰수는 " + result);
		System.out.println();
		
		// 2. 두 정수의 나머지를 구하는 메소드
		for(;;) {
			
			System.out.println("나머지를 구할 두 수를 입력하세요");
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a == 0 || b == 0) {
				System.out.println("계속하려면 아무키나 누르십시오");
				break;
			}
			
			int rest = func2(a, b);
			System.out.println("나머지 연산 결과 : " + a + " % " + b + " = " + rest);
		}
		
		// 무한루프로 사용시 while(true)로도 사용가능
	}

}
