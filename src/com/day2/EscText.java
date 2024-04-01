package com.day2;

public class EscText {

	public static void main(String[] args) {
		/*
			escape sequence
			- 문자열안에서 특별한 의미로 해석되는 문자
			- 표현하기 어려운 문자상수를 표현할 수 있는 방법
			
			\n	줄바꿈(개행)
			\t	탭
			\"	큰따옴표
			\\	역슬래쉬
		 */
		
		String str1 = "d:\\data\\file.txt";
		String str2 = "Hello\t\"Java\"!!";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(" Hi\n Spring");
	}

}
