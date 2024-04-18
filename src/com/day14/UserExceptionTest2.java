package com.day14;

import java.util.Scanner;

public class UserExceptionTest2 {
	
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		if(age < 0) {
			throw new AgeInputException("유효하지 않은 나이임!");
		}
		return age;
	}

	public static void main(String[] args) {
		
		try {
			int age = readAge();
			System.out.println("나이 : " + age);
		} catch(AgeInputException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
	}

}
