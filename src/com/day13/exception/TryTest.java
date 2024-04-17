package com.day13.exception;

import java.util.Scanner;

public class TryTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력!");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result = n1 / n2;
		System.out.println("몫 : " + result);
		
		System.out.println("\n다음 문장");
		
	}

}
