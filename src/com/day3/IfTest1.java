package com.day3;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		/*
		 제어문 - 프로그래밍의 실행순서나 흐름을 제어
		 
		 1. 조건문
		 	if, switch
		 2. 반복문 
		 	for, while, do~while
		 	
		 1) if문
		 	if(조건식){
		 		문장
		 	}
		 	
		 	=> 조건식을 만족하면 문장을 실행,
		 		만족하지 않으면, 한번도 수행하지 않는다
		 	
		 	if(조건식){
		 		문장 1
		 	} else {
		 		문장 2
		 	}
		 	
		 	=> 조건식을 만족하면 문장1을 수행하고
		 		만족하지 않으면 문장2를 수행
		 		
		 	if(조건 1){
		 		문장 1
		 	} else if(조건 2){
		 		문장 2
		 	} else{
		 		문장 3
		 	}
		 	
		 	=> 조건 1이 참이면 문장1을 수행,
		 		조건 1이 거짓이면 조건 2가 참인지 거짓인지 검사 후
		 		참이면 문장 2를 수행,
		 		조건 1, 2 모두 거짓이면 문장 3을 수행
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		// [1] if
		if(num > 0) {
			System.out.println("양수");
		}
		System.out.println("단독 if문 수행\n");
		
		// [2] if~else
		if(num > 0) {
			System.out.println("양수");
		} else { // !(num > 0)
			System.out.println("음수");
		}
		System.out.println("if~else 수행\n");
		
		// [3] if~else if~else
		if(num > 0) {
			System.out.println("양수");
		} else if(num < 0){
			System.out.println("음수");
		} else { // num == 0 ;
			System.out.println("0");
		}
		System.out.println("if~else if~else 수행\n");
		
		// 출력의 반복을 방지
		String result = "";
		if(num > 0) {
			result = "양수";
		} else if(num < 0){
			result = "음수";
		} else { // num == 0 ;
			result = "0";
		}
		System.out.println(result);
	}

}
