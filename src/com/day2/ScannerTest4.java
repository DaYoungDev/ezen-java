package com.day2;

import java.util.Scanner;

public class ScannerTest4 {

	public static void main(String[] args) {
		// 지방, 탄수화물, 단백질 칼로리의 계산 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("지방의 그램을 입력하세요 : ");
		int fat = sc.nextInt();
		
		System.out.print("탄수화물의 그램을 입력하세요 : ");
		int carbohydrate = sc.nextInt();
		
		System.out.print("단백질의 그램을 입력하세요 : ");
		int protein = sc.nextInt();
		
		int calory = fat * 9 + protein * 4 + carbohydrate * 4;
		System.out.println("\n총 칼로리 : " + calory);
		
		double kcal = calory / 1000.0;
		System.out.print("총 kcal : " + kcal);
		
	}

}
