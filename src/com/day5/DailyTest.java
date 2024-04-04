package com.day5;

import java.util.Scanner;

public class DailyTest {

	public static void main(String[] args) {
		for(int i = 11; i <= 50; i++) {
			if(i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		
		for(int i = 7; i >= -3; i--) {
			if(i % 2 != 0) {
				if(i > 1) {
					System.out.println(i + ": hi");
				} else if(i == 1) {
					System.out.println(i + ": hello");
				} else {
					System.out.println(i + ": 안녕");
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 정수의 개수를 입력하세요");
		int count = sc.nextInt();
		int sum = 0;
		
		System.out.println("정수를 입력하세요");
		for(int i = 0; i < count; i++) {
			sum += sc.nextInt();
		}
		
		double avg = sum / count;
		System.out.println("평균 : " + avg);
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
//		for(;;) {
//			
//		}
		
		sum = 0;
		for(int i = 2; i <= 20 ; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("2~20까지의 홀수의 합 : " + sum);
		
		for(int i = 1; i <= 30 ; i++) {
			if(i % 4 == 0 || i % 6 == 0) {
				System.out.println(i + "\t");
			}
		}
//		do {
//			실행문
//		}while(조건문);
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 3; i <= 9; i += 2) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		while(true) {
			System.out.println("두 숫자를 입력하세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				System.out.println("나눗셈을 종료합니다.");
				break;
			}
			
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}
			
			System.out.println("몫 : " + (num1 / num2) + ", 나머지 : " + (num1 % num2));
		}
		
		char ch = 'a';
		Character.isAlphabetic(ch);
		char a = '0';
		Character.isDigit(a);
		String lang = "java";
		lang.equals("java");
		
		boolean powerOn = false;
		
		if(powerOn != false) {
			
		}
		ch = 'y';
		if(ch == 'y' || ch == 'Y') {
			
		}
		
	}

}
