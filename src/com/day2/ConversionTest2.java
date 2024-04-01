package com.day2;

public class ConversionTest2 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'Z';
		
		int num1 = ch1 ; // char => int 자동형변환
		int num2 = (int)ch2; // 명확성을 위해 명시적형변환
		
		System.out.println("A의 유니코드값 : " + num1);
		System.out.println("Z의 유니코드값 : " + num2);
		System.out.println("Z의 유니코드 : " + (int)ch2);
		
		int a = 97;
		// char b = a; // error
		char b = (char)a;
		
		int c = 122;
		char d = (char)c;
		
		System.out.println("유니코드 " + a +"에 해당하는 문자 : " + b);
		System.out.println("유니코드 " + c +"에 해당하는 문자 : " + d);
		
		int n = ch1 + 1; // char + int => int + int => int
		char ch3 = (char)(ch1 + 2);
		System.out.println("n = " + n + ", ch3 = " + ch3);
	}

}
