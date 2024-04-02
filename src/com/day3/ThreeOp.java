package com.day3;

public class ThreeOp {

	public static void main(String[] args) {
		/*
		 삼항연산자
		 변수 선언 = (조건문) ? 값1 : 값2;
		 
		 조건문의 결과가 true이면 값1을 
		 			 false이면 값2를 변수에 대입
		 조건식 => 결과가 true, false => 비교연산자나 논리연산자가 필요함
		*/
		
		int a = 10, b = 20;
		int c = (a > b) ? a : b;
		System.out.println("더 큰수: " + c);
		
		int d = 30;
		System.out.println(d == 30 ? "같다" : "다르다");
		
		int g = 1;
		String str = (g != 1) ? "여자" : "남자";
		System.out.println(str);
	
		g = 4;
		str = (g == 1 || g == 3) ? "남자" : "여자";
		System.out.println(str);
	}

}
