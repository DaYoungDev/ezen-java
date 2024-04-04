package com.day4;

import java.util.Scanner;

public class DoWhileTest1 {

	public static void main(String[] args) {
		/*
		 do while문
		 - 선실행 후조건처리
		 - 조건이 거짓이더라도 실행구문을 최소한 한번은 수행
		 
		 do {
		 	명령문
		 } while(조건식);
		 */
		
		int k = 1;
		do {
			System.out.println("k = " + k);
			k++;
			
		} while(k > 3);
		
		k = 0;
		do {
			System.out.println(k);
			k++;
		} while(k < 3);
		
		// 무한루프 대신 사용한 경우
		Scanner sc = new Scanner(System.in);
		int sum = 0, num = 0;
		do {
			System.out.println("숫자입력! (끝낼때 0)");
			num = sc.nextInt();
			sum += num;
		} while(num != 0);
		System.out.println("\n합: " + sum);
	}

}
