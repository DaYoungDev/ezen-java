package com.day13.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 다중 예외처리 - 다중 catch문
 - try문에서 여러 개의 예외가 발생할 수 있을 때는 
   발생가능한 모든 예외에 대해 
   여러 개의 catch문을 나열하고 각각 다르게 처리할 수 있다 
 - 발생한 예외의 종류와 일치하는 단 한개의 catch블럭만 수행됨
 - 자식에서 부모순으로 와야 함

 */

public class MultiCatchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수입력");
			int n = sc.nextInt();
			
			int result = 100 / n;
			System.out.println("result = " + result);
			
		} catch (ArithmeticException e) { // 자식
			System.out.println("0으로 나누면 안됨 : " + e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("정수만 입력 : " + e.getMessage());
			e.printStackTrace();
		}catch (Exception e) { // 부모
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		System.out.println("\n=======next==========");
	}

}
