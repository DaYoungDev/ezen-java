package com.day4;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		/*
		 1~3까지의 합
		 
		 sum = 0;
		 
		 i	sum
		 1	0+1
		 2	0+1 +2
		 3	0+1+2 +3
		 4	0+2+3 +4
		 
		 sum = sum +i (기존 sum에 i를 더한다)
		 => sum += i
		 */
		
		int sum = 0;
		for(int i = 1; i <= 4 ; i++) {
			sum += i;
			System.out.println("i = " + i + ", sum = "+ sum);
		}
		System.out.println("1~4까지의 합 : " + sum);
		
		// 1 ~ n 까지 짝수의 합
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int count = sc.nextInt();
		sum = 0;
		
		for(int i = 0; i <= count; i += 2) {
			sum += i;
		}
		System.out.println("1~" + count + "까지 짝수의 합 = " + sum);
		
	}

}
