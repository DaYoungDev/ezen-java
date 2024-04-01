package com.day1;

public class VarTest3 {
	
	public static void main(String[] args) {
		// 실수형 - float, double
		// float : 뒤에 F,f를 붙여야함
		float a = 3.14f; // f를 붙이지 않으면 double로 인식
		double b = 3.1415;
		double c = a*b; // float * double => double
		System.out.println("float a=" + a + ", double b=" + b);
		System.out.println("a*b=>" + c);
		
		// 소수점 이하 정밀도 확인
		float x = 22f, y = 7f;
		float z = x / y;
		System.out.println("float 연산 결과:" + z);
		
		double i = 22, j = 7;
		double k = i / j;
		System.out.println("double 연산결과:" + k);
		
		float m = .567F;
		float n = 456;
		// float형은 정수를 입력받더라도 자동으로 float형으로 형변환되어
		// 소수점 .0이 붙게 된다.
		System.out.println("m=" + m + ", n=" + n);
	}

}
