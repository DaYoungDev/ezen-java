package com.day4;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {
		// 사용자로부터 숫자 입력받아 그 수만큼 3배수를 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("3의 배수의 개수를 입력하세요");
		int num1 = sc.nextInt();
		
		for(int i = 1; i <= num1 ; i++) {
			System.out.print(i * 3 + "\t");
		}
		System.out.println();
		
		// 계승을 계산하는 프로그램 작성
		// 사용자에게 n을 입력받으면 n!을 계산해서 출력
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int num2 = sc.nextInt();
		int result = 1;
		
		for(int i = 1; i <= num2; i++) {
			result *= i;
		}
		
		System.out.println("1~" + num2 + "까지의 곱(계승, factorial) : " + result);
	}

}
