package com.day13.exception;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// for문 안에 try문이 있는 경우
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			try {
				System.out.println("두 정수 입력!");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				
				int result = n1 / n2;
				System.out.println("결과 : " + result);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				i--;
			}
		}
		
		// try문 안에 for문이 있는 경우
		System.out.println("\n=============");
		try {
			for(int i = 0; i < 2; i++) {
				System.out.println("두 정수 입력!");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				
				System.out.println("나눗셈 : " + n1 / n2);
			}
		}catch(Exception e) {
			System.out.println("예외 : " + e);
		}
		
		System.out.println("\n ======== next ========");
	}

}
