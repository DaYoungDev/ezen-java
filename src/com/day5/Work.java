package com.day5;

import java.io.IOException;
import java.util.Scanner;

public class Work {
	// 1. 윤년 여부 확인 메소드 정의
	public static String yearCheck(int year) {
		String check = "평년입니다.";
		
		if(year % 4 == 0) {
			if(year % 100 != 0 && year % 400 == 0) {
				check ="윤년입니다.";
			}
		}
		return check;
	}
	
	// 2. 홀짝 확인 메소드 정의
	public static String oddOrEven(int num) {
		String result = "";
		if(num % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		return result;
	}
	
	// 3. 주민번호로 성별구분 메소드 정의
	public static String genderCheck(int genNum) {
		String result = "";
		if(genNum == 1 || genNum == 3) {
			result = "남자";
		} else if(genNum == 2 || genNum == 4) {
			result = "여자";
		}
		return result;
	}
	
	// 4. String to int 메소드 정의
	public static int convToInt(char number) {
		int result = number - '0';
		return result;
	}
	
	// 5. 반복 출력 메소드 정의
	public static void repeatPrint(int count) {
		
		for(int i = 1; i <= count; i++) {
			for(int j = 1; j <= i; j++) {
				if(i == j) {
					System.out.print("B");
				}else {
				System.out.print("A");
				}
			}
			System.out.println();
		}
	}
	
	// 6. 원의 면적, 사각형의 면적을 구하는 메소드 오버로딩
	// 6-1 원의 면적 메소드 정의
	public static double area(int radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	// 6-2 사각형의 면적 메소드 정의
	public static int area(int width, int length) {
		int area = width * length;
		return area;
	}
	
	// 7. 피보나치 수열 메소드 정의
	public static int fib(int count) {
		int result = 0;
		
		if(count == 1) {
			result = 1;
		} else if(count == 2) {
			result = 1;
		} else if(count >= 3) {
			result = fib(count - 2) + fib(count - 1);
		}
		
		return result;
	}
	
	// 8. 사이 숫자 합 메소드 정의
	public static int numSum(int start, int end) {
		int result = 0;
		if(start > end) {
			int tem = start;
			start = end;
			end = tem;
		}
		for(int i = start; i <= end; i++) {
			result += i;
		}
		
		return result;
	}
	
	// 9. n * n 블럭 숫자 채우기
	public static void blockPrint(int block) {
		int count = 0;
		for(int i = 1; i <= block; i++) {
			for(int j = 1; j <= block; j++) {
				System.out.print(++count + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// 1. 윤년인지 평년인지 메소드 만들기
		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();
		String result = yearCheck(year);
		System.out.println(result);
		System.out.println();
		
		// 2. 홀짝 구분 메소드 만들기
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		result = oddOrEven(num);
		System.out.println(result);
		System.out.println();
		
		// 3. 주민번호로 성별 구분 메소드 만들기
		System.out.println("주민번호 뒷자리 숫자를 입력하세요");
		System.out.println("1, 3 : 남자 / 2, 4 : 여자");
		int genNum = sc.nextInt();
		
		result = genderCheck(genNum);
		System.out.println(result);
		System.out.println();
		
		// 4. char to int >> convToInt()
		System.out.println("0~9 사이의 숫자를 입력하세요");
		char number = (char)System.in.read();
		int chToint = convToInt(number);
		System.out.println(number + "=>" + chToint);
		System.out.println(chToint + " * " + "100 = " + (chToint * 100));
		System.out.println();
		
		// 5. 입력에 따른 출력을 하는 메소드 만들기
		/*
		 반복횟수를 입력하세요 : 5
		 B
		 AB
		 AAB
		 AAAB
		 AAAAB
		 */
		System.out.print("반복횟수를 입력하세요 : ");
		int count = sc.nextInt();
		repeatPrint(count);
		System.out.println();
		
		// 6. 원의 면적, 사각형의 면적을 구하는 오버로딩 메소드 만들기
		System.out.println("가로, 세로, 반지름을 입력하세요");
		int width = sc.nextInt();
		int length = sc.nextInt();
		int radius = sc.nextInt();
		
		int squareArea = area(width, length);
		double circleArea = area(radius);
		System.out.println("사각형의 면적 : " + squareArea);
		System.out.println("원의 면적 : " + circleArea);
		System.out.println();
		
		// 7. 피보나치수열 재귀호출사용
		int fibResult = fib(9);
		System.out.println(fibResult);
		System.out.println();
		
		// 8. 두 숫자를 받아서 사이의 숫자의 합을 구하시오
		System.out.println("두 숫자를 입력하세요");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int numSum = numSum(start, end);
		System.out.println(numSum);
		
		// 9. 숫자를 받아서 n * n 사각형 안에 숫자가 차례대로 들어가게 출력
		System.out.println("숫자를 입력하세요 n * n");
		int block = sc.nextInt();
		blockPrint(block);
		
	}

}
