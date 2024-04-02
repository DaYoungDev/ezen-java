package com.day3;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		// 1. 사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 성별은 무엇입니까? (M/F)");
		String gender = sc.nextLine();
		
		// 2. 로직 처리
		String result = "";
		if(gender.equals("M")) {
			result = "남자";
		}else if(gender.equals("F")) {
			result = "여자";
		} else {
			result = "잘못 입력했어요!";
		}
		
		// public boolean equals(Object anObject)
		// Object는 모든 클래스의 조상으로 다양한 형태를 담을 수 있다.
		/*
		 기본자료형에서 등가연산자(==)는 값을 비교
		 참조형에서 등가연산자는 주소를 비교
		 문자열의 값을 비교하려면 String클래스의 equals() 메소드를 이용
		*/
		
		// 소문자도 가능하게 논리연산자 사용
		if(gender.equals("M") || gender.equals("m")) {
			result = "남자";
		}else if(gender.equals("F") || gender.equals("f")) {
			result = "여자";
		} else {
			result = "잘못 입력했어요!";
		}
		
		// public String toUpperCase() >> 받은 문자를 대문자로 변경
		String uGender = gender.toUpperCase();
		if(uGender.equals("M")) {
			result = "남자";
		}else if(uGender.equals("F")) {
			result = "여자";
		} else {
			result = "잘못 입력했어요!";
		}
		
		
		// public boolean equalsIgnoreCase(String anotherString)
		// >> 대소문자 구분없이
		if(gender.equalsIgnoreCase("M")) {
			result = "남자";
		}else if(gender.equalsIgnoreCase("F")) {
			result = "여자";
		} else {
			result = "잘못 입력했어요!";
		}
		// 3. 결과 출력
		System.out.println(result);
		
	}

}
