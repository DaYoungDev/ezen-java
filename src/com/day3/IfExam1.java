package com.day3;

import java.util.Scanner;

public class IfExam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 성별구분 (1이면 남자, 2이면 여자)
		System.out.println("성별을 입력하세요 (1. 남자, 2. 여자)");
		int genNumber = sc.nextInt();
		String gender = "";
		
		if(genNumber == 1) {
			gender = "남자";
		} else if(genNumber == 2) {
			gender = "여자";
		} else {
			gender = "잘못입력하셨습니다.";
		}
		System.out.println("성별 : " + gender + "\n");
		
		
		// 2. 성별 구분 (1, 3 이면 남자, 2, 4 이면 여자)
		System.out.println("성별을 입력하세요 (1 or 3 : 남자, 2 or 4 : 여자)");
		genNumber = sc.nextInt();
		
		if(genNumber == 1 || genNumber == 3) {
			gender = "남자";
		} else if(genNumber == 2 || genNumber == 4){
			gender = "여자";
		} else {
			gender = "잘못입력하셨습니다.";
		}
		System.out.println("성별 : " + gender + "\n");
		
		
		// 3. 날짜 입력받기
		System.out.println("날짜(일)을 입력하세요 1~31");
		int day = sc.nextInt();
		String str = "";
		
		if(day >= 1 && day <= 10) {
			str = "초순";
		} else if(day >= 11 && day <= 20) {
			str = "중순";
		} else if(day >= 21 && day <= 31) {
			str = "하순";
		} else {
			str = "잘못 입력하였습니다.";
		}
		
		System.out.println(day + "일 : " + str);
	}

}
