package com.day2;

public class ConversionTest5 {

	public static void main(String[] args) {
		// 소문자를 대문자로 변환하는 프로그램 작성하기
		char a = 'a';
		int change = 32;
		System.out.println(a + " => 대문자로 변환 : " + (char)(a - change));
		
		// float형 변수 pi의 값을 소수점 셋째 자리까지만 빼내서 출력하기
		float pi = 3.141592f;
		int b = (int)(pi * 1000); // 3141
		float result = (float)b / 1000; // 3.141
		// float result = b / 1000f;	// int / float => float
		System.out.println("result : " + result);

	}

}
