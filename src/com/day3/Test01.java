package com.day3;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 1.양수 음수인지  판별하여 출력 (삼항 연산자 이용)
		int num1 = -25;
		String str1 = (num1 >= 0) ? "양수" : "음수";
		System.out.println(str1);
		
		// 2. 홀짝 판별 (삼항 연산자 이용)
		int num2 = 17;
		String str2 = ((num2 % 2) == 1) ? "홀수" : "짝수";
		System.out.println(str2);
		
		// 3. 입력받아서 홀짝인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num3 = sc.nextInt();
		String str3 = ((num3 % 2) == 1) ? "홀수" : "짝수";
		System.out.println(str3);
		
	}

}
