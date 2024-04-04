package com.day4;

import java.util.Scanner;

public class DailyTest {

	public static void main(String[] args) {
		
		int num = 2;
		String result = ((num % 2) == 1) ? "홀수" : "짝수";
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num2 = sc.nextInt();
		
		String result2 = (num2 > 0)? "양수" : "음수";
		System.out.println(result2);
		
		System.out.println("두 숫자를 입력하세요.");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		int result3 = (num3 > num4)? num3 : num4;
		System.out.println(result3 + "이/가 더 크다.");
		
		int num5 = 4;
		String result4 = "";
		if((num5 / 2) == 1) {
			result4 = "홀수";
		} else{
			result4 = "짝수";
		}
		System.out.println(result4);
		
		int genNumber = 1;
		String gender = "";
		if(genNumber == 1) {
			gender = "남자";
		} else if(genNumber == 2){
			gender = "여자";
		}
		System.out.println(gender);
		
		gender = (genNumber == 1)? "남자" : "여자";
		System.out.println(gender);
		
		
		if(genNumber == 1 || genNumber == 3) {
			gender = "남자";
		} else if(genNumber == 2 || genNumber == 4){
			gender = "여자";
		}
		System.out.println(gender);
		
		String str = "yes";
		if(str.equals("yes")) {
			
		}
		
//		if(조건문 1) {
//			실행문 1
//			if(조건문 2) {
//				실행문 2
//			}
//		}
		
		System.out.println("직업을 입력하세요. A.회사원 B.학생 C.주부 D.기타");
		String job = sc.next();
		switch(job.toUpperCase()) {
		case "A" : 
			System.out.println("회사원이시군요");
			break;
		case "B" : 
			System.out.println("학생이시군요");
			break;
		case "C" : 
			System.out.println("주부이시군요");
			break;
		case "D" : 
			System.out.println("기타를 선택했어요");
			break;
		default :
			System.out.println("잘못입력했어요.");
		}
		

	}

}
