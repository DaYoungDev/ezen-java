package com.day14;

import java.util.Scanner;

/*
 finally 절
 - 예외가 발생해도 호출되며, 그렇지 않아도 호출됨
 - 예외 발생여부와 상관업이 반드시 실행되어야 하는 구문을 입력하는 곳
 - 사용했던 자원을 해제할 때 주로 사용됨(DB close, 파일 닫기 등)
 */
public class FinallyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		
		try {
			int n = sc.nextInt();
			int result = 100 / n;
			System.out.println("result : " + result);
		} catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} finally {
			System.out.println("반드시 실행되는 곳!");
		}
		
		System.out.println("\n=========next=========");
		
		
	}

}
