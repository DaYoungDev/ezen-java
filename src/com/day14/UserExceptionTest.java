package com.day14;

import java.util.Scanner;

/*
 사용자 정의 예외 클래스 만들기
 - 새로운 예외 클래스를 정의하여 사용할 수 있다
 
 class 예외클래스이름 extends Exception{
 	생성자(String msg){
 		super(msg); // 부모인 Exception 클래스의 생성자 호출
 	}
 }
 */

// Exception(String msg)
// - String 값을 받아서 메세지로 저장 => getMessage()로 메세지를 얻어옴

class AgeInputException extends Exception{
	public AgeInputException(String msg) {
		super(msg);
	}
}

public class UserExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("나이입력");
			int age = sc.nextInt();
			if(age < 0) {
				throw new AgeInputException("유효하지 않는 나이입니다");
			}
			System.out.println("나이 : " + age);
		}catch(AgeInputException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		System.out.println("\n======next======");
	}

}
