package com.day3;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// 평균을 입력받아 학점 구하기
		
		// 1. 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요");
		int average = sc.nextInt();
		
		// 2. 로직 처리
		String grade = "";
		if(average >= 90) {
			grade = "A";
		} else if(average >= 80) { // < 90
			grade = "B";			
		} else if(average >= 70) { // < 80
			grade = "C";			
		} else if(average >= 50) { // < 70
			grade = "D";			
		} else { // < 50
			grade = "F";			
		}
		
		// 100 이상의 숫자 막고 오차범위 제거
		if(average >= 90 && average <= 100) {
			grade = "A";
		} else if(average >= 80 && average < 90) { // av< 90 || av> 100
			grade = "B";			
		} else if(average >= 70 && average < 80) { // < 80
			grade = "C";			
		} else if(average >= 50 && average < 70) { // < 70
			grade = "D";			
		} else if(average >= 0 && average < 50) { // < 50
			grade = "F";			
		} else {
			grade ="잘못 입력함!";
		}
		
		// 3. 출력하기
		System.out.println("평균 : " + average);
		System.out.println("학점 : " + grade);
		
		// 중첩 if
		/*
		 if문이 중복으로 사용된 것
		 바깥쪽 if 문이 참이 되어야 안쪽 if문을 수행함
		 
		 if(조건식1){
		 	if(조건식2){
		 		명령문1;
		 	} else {
		 		명령문2;
		 	}
		 }
		 */
		
		if(average <= 100 && average >= 0) { // 바깥 if
			if(average >= 90) { // 안쪽 if
				grade = "A";
			} else if(average >= 80) { // < 90
				grade = "B";			
			} else if(average >= 70) { // < 80
				grade = "C";			
			} else if(average >= 50) { // < 70
				grade = "D";			
			} else { // < 50
				grade = "F";			
			}
		} else {
			grade ="잘못 입력함!";
		}
		
		System.out.println("\n중첩 if 이용 평균 : " + average);
		System.out.println("중첩 if 이용 학점 : " + grade);
	}

}
