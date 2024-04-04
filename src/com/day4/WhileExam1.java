package com.day4;

import java.util.Scanner;

public class WhileExam1 {

	public static void main(String[] args) {
		// while 0-100 사이에 존재하는 짝수의 합
		int sum = 0;
		int num = 0;
		while (num <= 100) {
			if((num % 2) == 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("0~100까지 짝수의 합 : " + sum);
		
		// 입력받은 숫자에 해당하는 구구단을 역순으로 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단을 입력하세요");
		int dan = sc.nextInt();
		int j = 9;
		
		while(j > 0) {
			System.out.println(dan + "*" + j + "=" + (dan * j));
			j--;
		}
	}
	
}