package com.day2;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// 사각형 면적 구하기
		// 1. 사용자로부터 입력받기 - 가로, 세로
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 너비를 입력하세요");
		int w = sc.nextInt();
		
		System.out.println("사각형의 높이를 임력하세요");
		int h = sc.nextInt();
		
		// 2. 비즈니스 로직처리 - 사각형 면적 구하기
		int area = w * h;
		
		// 3. 결과 출력
		System.out.println("사각형 면적 : " + area);
	}

}
