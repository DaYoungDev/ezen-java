package com.day2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// public int nextInt()
		// => 사용자로부터 정수값을 입력받을 때 사용
		
		// public String nextLine()
		// => 문자열을 입력받을 때
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("이름 : " +  name);
		System.out.println("나이 : " +  age);
		
		/*
		 [1] static이 붙은 method 호출 - 클래스명.메소드()
		 [2] static이 붙지 않은 method 호출 
		 	클래스의 객체 생성 후
		 	참조변호.메소드()
		 */
	}

}
