package com.day13.exception;

import java.util.Scanner;

/*
 예외 : 실행 도중에 발생하는 오류
 		프로그램의 실행을 중단시킴

 에러
 [1] 컴파일 에러(compile error)
 [2] 실행 에러(runtime error)
 	1) 에러(error) - 메모리 부족 등 복구할 수 없는 심각한 오류
 	2) 예외(exception) - 수습될 수 있는 덜 심각한 오류

 # 예외처리
 - 예외의 발생에 대비한 코드를 작성하는 것
 - 프로그램의 비정상종료를 막고, 정상적인 실행상태를 유지할 수 있다

 # 예외처리 구문
 try {
 	예외가 발생할만한 코드를 배치
 } catch(Exception e){
 	예외를 잡아 실패에 대한 처리를 하는 코드
 }
 */

public class TryTest2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 정수 입력!");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			int result = n1 / n2;
			System.out.println("몫 : " + result);
		} catch(ArithmeticException e) {// Exception은 모든 예외 클래스의 조상
			System.out.println("0으로 나눌 수 없다.");
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("\n다음 문장");

	}

}
