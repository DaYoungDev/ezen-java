package com.day3;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		
		// 1. switch 문 산술연산
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요(+, -, * , / , %)");
		String str = sc.nextLine();
		System.out.println("실수를 두 개 입력하세요");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double result = 0.0;
		
		switch(str) {
			case "+" : 
				result = num1 + num2;
				System.out.println("결과값 : " + result);
				break;
			case "-" : 
				result = num1 - num2;
				System.out.println("결과값 : " + result);
				break;
			case "*" : 
				result = num1 * num2;
				System.out.println("결과값 : " + result);
				break;
			case "/" : 
				result = num1 / num2;
				System.out.println("결과값 : " + result);
				break;
			case "%" : 
				result = num1 % num2;
				System.out.println("결과값 : " + result);
				break;
			default :
				System.out.println("잘못 입력하였습니다.");
		}
		
		// 2. 중첩 if 문 나이 및 취미 설문조사
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("취미를 입력하세요 : 1.영화 2.축구 3.야구 4.등산");
			int hobby = sc.nextInt();
			if(hobby == 1) {
				System.out.println("영화를 선택하였습니다.");
			} else if(hobby == 2) {
				System.out.println("축구를 선택하였습니다.");
			} else if(hobby == 3) {
				System.out.println("야구를 선택하였습니다.");
			} else if(hobby == 4) {
				System.out.println("등산를 선택하였습니다.");
			} else {
				System.out.println("잘못입력하였습니다.");
			}
		} else {
			System.out.println("20세 이상만 본 설문에 응할 수 있습니다.");
		}
	}

}
