package com.day13.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("두 수를 입력하세요.");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int result = n1 / n2;
			System.out.println("result : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		} 
		
		try {
			System.out.println("두 실수를 입력하세요");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			System.out.println("덧셈의 연산 결과 : " + (n1 + n2));
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요");
			System.out.println(e.getMessage());
		}
	}

}
