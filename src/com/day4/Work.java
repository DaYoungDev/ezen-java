package com.day4;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		// 1~99 사이에 있는 정수 중 7,9의 배수 출력
		System.out.println("7의 배수이거나 9의 배수");
		
		int count = 0;
		for(int i = 1; i < 100; i++) {
			if((i % 7) == 0 || (i % 9) == 0) {
				System.out.print(i + "\t");
				count++;
				if(count == 9) {
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println("계속하려면 아무 키나 누르십시오.");
		System.out.println();
		
		
		// 가로로 5개씩만 출력하기
		System.out.println("7의 배수이거나 9의 배수");
		count = 0;
		for(int i = 1; i < 100; i++) {
			if((i % 7) == 0 || (i % 9) == 0) {
				System.out.print(i + "\t");
				count++;
				if(count == 5) {
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println("계속하려면 아무 키나 누르십시오.");
		
		// 중첩 for문 * 찍기
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 5; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 중첩 for문 숫자의 합
		for(int i = 1; i <= 11; i++) {
			for(int j = 1; j < i; j++) {
				if(j == 1) {
					System.out.print(j);
				} else {
					System.out.print("+" + j);
				}
				
			}
			System.out.println();
		}
		System.out.println();
		
		// 반복문
		// 1) 1~20 중 2 또는 3의 배수가 아닌 수의 총합
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if((i % 2) != 0 && (i % 3) != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println();
		
		// 2) totalSum 1+(1+2)+(1+2+3)+...+(1+2+3+...+9+10)
		int totalSum = 0;
		int lineSum = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				lineSum += j;
			}
			totalSum += lineSum;
			lineSum = 0;
		}
		System.out.println("totalSum = " + totalSum);
		System.out.println();
		
		// 3) 두개의 주사위 눈의 합이 6이 되는 모든 경우의 수를 출력
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if((i + j) == 6) {
					System.out.println(i + "," + j);
				}
			}
		}
		System.out.println();
		
		// 4) 숫자로 이루어진 문자열을 각각의 숫자의 합으로 구하여라
		// ex) "12345" => 1+2+3+4+5 => 15
		System.out.println("4자리 이상의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sum = 0;
		// char String.charAt(int index)
		for(int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		// 5) int타입의 변수의 각각의 자리의 숫자의 합을 구하시오
		// ex) 12345 => 1+2+3+4+5 => 15
		System.out.println("4자리 이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		sum = 0;
		while(num % 10 != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		// 6) 사용자로부터 받은 문자열이 숫자인지 판별하는 프로그램
		System.out.println("값을 입력하세요");
		String str1 = sc.next();
		char ch;
		String result = "";
		
		for(int i = 0; i < str1.length(); i++) {
			ch = str1.charAt(i);
			if('0' <= ch && ch <= '9') {
				result = "숫자입니다.";
			} else {
				result = "숫자가 아닙니다.";
				break;
			}
		}
		System.out.println(str1 + result);
		System.out.println();
		
		// 7) 반복하고 싶은 횟수(n)를 받아서 String 출력, 0~n-1까지 출력, n까지 합계 출력
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println("재미있는 java!");
		}
		System.out.println();
		
		for(int i = 0; i < num; i++) {
			System.out.println("i = " + i);
		}
		System.out.println();
		
		sum = 0;
		for(int i = 0; i <= num; i++) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		System.out.println("0부터 " + num + "까지의 합 = " + sum);
		System.out.println();
	}

}
