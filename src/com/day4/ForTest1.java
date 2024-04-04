package com.day4;

public class ForTest1 {

	public static void main(String[] args) {
		/*
		 반복문 - 반복적인 작업을 수행할 때 사용
		 1. for
		 2. while
		 3. do~while
		 4. 확장 for
		 
		 for문
		 - 반복횟수가 미리 정해진 경우 주로 사용
		 
		 for(초기식; 조건식; 증감식){ // 시작값, 최종값, 증가값
		 	반복명령;
		 }
		 */
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Hello java!");
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n-----i값 감소-----");
		for(int i = 3; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		/*
		 [1] i = 0
		 1. hi spring
		 2. hi spring
		 3. hi spring
		 */
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ". hi spring");
		}
		System.out.println();
		
		// [2] 1 3 5 7 9로 출력하기 i값을 그대로 출력
		for(int i = 0; i < 10; i++) {
			if((i % 2) == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		for(int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println();
		
		// 10~-6 까지 짝수만 찍히게
		for(int i = 10; i > -7; i -= 2) {
			if(i > 0) {
				System.out.println(i + " java");
			} else if(i < 0) {
				System.out.println(i + " spring");
			} else {
				System.out.println(i + " oracle");
			}
		}
	}

}
