package com.day14;

import java.util.Scanner;

/*
 throw 구문
 - 예외를 강제로 발생시킬 때 사용
 - 자바가상머신에 의해 인식될 수 있는 예외상황이 아니지만,
   프로그램의 성격에 따라 개발자가 정의한 예외상황인 경우 사용
 
  throw new Exception("예외 메세지");
 */

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("나이입력");
			int age = sc.nextInt();
			if(age < 0) {
				// 개발자가 고의로 예외를 직접 발생시킴
				throw new Exception("나이는 양수만 입력해야함");
				// Exception 생성자에 String을 넣어주면,
				// 이 String이 Exception 인스턴스에 메세지로 저장됨
				// 이 메세지는 getMessage()로 얻을 수 있다
				// public Exception(String message)
			}
			System.out.println("나이 : " + age);
		}catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		System.out.println("\n======next======");
	}

}
