package com.day6;

import java.util.Scanner;

public class DailyTest {

	// 큰 수 비교 메소드 정의
	public static int than(int a, int b) {
		int result = (a > b)? a: b;
		return result;
	}
	
	// 성과급 계산 메소드 정의
	public static double bonus(int count, int cost) {
		double bonus = 0;
		if(count >= 250) {
			bonus = count * cost * 0.3;
		} else if(count >= 150) {
			bonus = count * cost * 0.2;
		} else if(count < 150) {
			bonus = count * cost * 0.1;
		}
		return bonus;
	}
	
	// 분기 메소드 정의
	public static String quarter(int month) {
		String quater = "";
		switch(month) {
		case 1:
		case 2:
		case 3:
			quater = "1사분기";
			break;
		case 4:
		case 5:
		case 6:
			quater = "2사분기";
			break;
		case 7:
		case 8:
		case 9:
			quater = "3사분기";
			break;
		case 10:
		case 11:
		case 12:
			quater = "4사분기";
			break;
		}
		return quater;
	}
	
	// 인사고과 등급 메소드 정의
	public static String scoreGrade(int score) {
		String grade = "";
		if(score >= 85) {
			grade = "A";
		} else if(score >= 70) {
			grade = "B";
		} else if(score < 70) {
			grade = "C";
		}
		return grade;
	}
	
	// 어학 등급 메소드 정의
	public static int rankPoint(int rank) {
		int point = 0;
		if(rank == 1) {
			point = 5;
		} else if(rank == 2){
			point = 3;
		} else if(rank == 3){
			point = 1;
		} else if(rank == 4){
			point = -1;
		}
		return point;
	}
	
	// 쿠폰 지급 메소드 정의
	public static String coupon(int number, int amount) {
		String coupon = "쿠폰 지급 대상이 아닙니다.";
		if(number >= 30 || amount >= 3000000) {
			coupon = "20% 할인쿠폰";
		}
		return coupon;
	}
	
	// 문자 숫자 구분 메소드
	public static String checkNumber(String line) {
		String result = "";
		
		for(int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if('0' <= ch && ch <= '9') {
				result = "숫자입니다.";
			} else {
				result = "숫자가 아닙니다.";
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int result = than(a, b);
		System.out.println(result + "가 더 크다.");
		
		int count = 250;
		int cost = 10000;
		double bonus = bonus(250, 10000);
		System.out.println("이번 성과금은 " + bonus + "원 입니다.");
		
		System.out.println("월을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		String quarter = quarter(month);
		System.out.println(quarter);
		
		
		int sum = 0;
		for(;;) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("정수의 합 : " + sum);
		
		
		// 인사고과 등급
		System.out.print("인사고과 점수를 입력하세요 : ");
		int score = sc.nextInt();
		String grade = scoreGrade(score);
		System.out.println("귀하의 등급은 " + grade + "입니다.");
		
		// 어학 평가 등급
		System.out.println("어학 평가 등급을 입력하세요");
		int rank = sc.nextInt();
		int point = rankPoint(rank);
		System.out.println("가산점 : " + point);
		
		// 쿠폰 지급
		System.out.print("거래 횟수를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.print("총 거래 금액을 입력하세요 : ");
		int amount = sc.nextInt();
		String coupon = coupon(number, amount);
		
		System.out.println(coupon);
		
		// 문자열 입력 후 숫자인지 문자인지 판별
		System.out.println("문자열을 입력하세요");
		String line = sc.next();
		String checkNumber = checkNumber(line);
		System.out.println(checkNumber);
	}

}
