package com.day7;

import java.util.Scanner;

public class TriangleTest1 {

	public static void main(String[] args) {
		// [1] main에서 직접 삼각형 면적 구하기
		
		// 사용자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형 밑변, 높이 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// 로직처리 - 삼각형 면적
		int area = w * h /2;
		
		// 결과 출력
		System.out.println("삼각형의 면적 : " + area);
		
	}

}
