package com.day2.op;

public class ArithOp {

	public static void main(String[] args) {
		// 산술 연산자
		/*
		 연산자의 우선순위
		 단항 > 이항 > 삼항
		 산술 > 비교 > 논리 > 대입
		 */
		
		int a = 7 + 3;
		int b = 7 - 3;
		int c = a * b;
		double d = 7.0 / 3;
		int e = 7 / 3;      //몫 
		int f = 7 % 3;    //나머지
		
		System.out.println("정수의 덧셈 a = 7 + 3 : " + a);
		System.out.println("정수의 뺄셈 b = 7 - 3 : " + b);
		System.out.println("정수의 곱셈 a * b : " + c);
		System.out.println("실수의 나눗셈 7.0 / 3 : " + d);
		System.out.println("정수의 나눗셈 7 / 3 : " + e);
		System.out.println("정수의 나머지 계산 7 % 3 : " + f);
		
		// 단항 연산자 - 부호 연산자
		// +, - 피연산자의 부호를 변경하는데 사용
		int i = -10; 
		i = +i;
		System.out.println(i); // -10
		i=-10;
		i = -i;
		System.out.println(i); // 10
		
	}

}
