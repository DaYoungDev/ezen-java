package com.day1;

public class VarTest6 {

	public static void main(String[] args) {
		// String - 참조형, 여러 개의 문자열을 넣는다.
		// "", 큰 따옴표로 감싸준다.
		String name = "홍길동";
		int year = 2024;
		
		System.out.println("이름 : " + name);
		System.out.println("년도 : " + year);
		System.out.println("올해는 " + year + "년 입니다.");
		
		
		/*
		  + : [1] 피연산자가 숫자일때는 덧셈
		  	  [2] 피연산자에 문자열이 있으면 문자열 연결 연산자
		*/
		
		int num1 = 9, num2 = 3;
		System.out.println(num1 + num2 + "<=결과"); // 12
		System.out.println("결과=>" + num1 + num2); // 93
		System.out.println("결과=>" + (num1 + num2)); // 12
		
	}

}
