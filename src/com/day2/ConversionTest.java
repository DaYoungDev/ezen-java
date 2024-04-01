package com.day2;

public class ConversionTest {

	public static void main(String[] args) {
		/*
		  형변환
		  - 원래의 자료형이 아닌 다른 자료형으로 변환되는 현상
		  - 연산 및 대입에서 발생
		  [1] 연산
		  	가장 큰 자료형으로 자동 형변환되어 연산함
		  [2] 대입
		  	대입할 때는 좌우변의 타입이 일치해야 함
		  	양쪽 타입이 같지 않은 경우 형변환을 통해 
		  	타입을 일치시킨 후 대입해야 함
		  	1) 자동형변환
		  		작은 범위의 데이터를 큰 범위에 할당하는 경우 자동형변환됨
		  	2) 명시적 형변환
		  		큰 범위의 데이터를 작은 범위에 할당하는 경우는 
		  		명시적으로 형변환 해주어야 함
		  		=> cast 연산자 이용
		  		자료형 변수1 = (자료형)변수2;
		  		
		  	# 자동형변환 규칙
		  	byte -> short -> int -> long -> float -> double
		  			char
		  			
		  	# 기본형과 참조형은 서로 형변환할 수 없다.
		 */
		// 1. 대입
		int a = 123;
		long b = a; // 자동 형변환
		
		float c = 2.8f;
		long d = (long)c; // 명시적 형변환
		
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("c = " + c + ", d = " + d);
		
		// 2. 연산
		int i = 1, j = 2;
		float k = i / j; // int / int => int, 결과값 = 0
		
		// 명시적형변환
		float m = (float) i / j; // float / int => float / float => float
		System.out.println("k = " + k + ", m = " + m);
		
		// 자동형변환
		double x = 3.14;
		double n = a * x; // int * double => double * double => double 
		System.out.println("x = " + x + ", n = " + n);
		
		
	}

}
