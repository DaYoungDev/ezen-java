package com.day2;

import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {
		// 사각형 면적 구하기
		// 1. 사용자로부터 입력받기 - 가로, 세로
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 너비를 입력하세요");
		String width = sc.nextLine();
		
		System.out.println("사각형의 높이를 임력하세요");
		String height = sc.nextLine();

		// 2. 비즈니스 로직처리 - 사각형 면적 구하기
		// 입력받은 문자열을 연산이 가능하도록 숫자로 변환
		int w = Integer.parseInt(width);
		int h = Integer.parseInt(height);
		
		int area = w * h;

		// 3. 결과 출력
		System.out.println("사각형 면적 : " + area);

	}

}
