package com.day5;

import java.util.Scanner;

public class MethodExam3 {
	// 1-1. inch to cm
	public static float inchToCm(float inch) {
		float cm = inch * 2.54f;
		return cm;
	}
	
	// 1-2. cm to inch
	public static float cmToInch(float cm) {
		float inch = cm / 2.54f;
		return inch;
	}
	
	// 2. 삼각형 넓이 구하기
	public static double triArea(int w, int h) {
		double area = w * h / 2.0;
		return area;
	}
	
	public static void main(String[] args) {

		// 1. inch to cm / cm to inch
		Scanner sc = new Scanner(System.in);
		System.out.println("변환하려는 inch를 입력하세요");
		float inch = sc.nextFloat();
		float cm = inchToCm(inch);
		System.out.println(inch + "inch => " + cm + "cm");
		
		System.out.println("변환하려는 cm를 입력하세요");
		cm = sc.nextFloat();
		inch = cmToInch(cm);
		System.out.println(cm + "cm => " + inch + "inch");
		System.out.println();
		
		// 2. 삼각형의 면적을 구하기
		System.out.println("삼각형의 밑변의 길이, 높이를 입력하세요");
		int width = sc.nextInt();
		int height = sc.nextInt();
		double area = triArea(width, height);
		System.out.println("삼각형의 면적 : " + area);
		
	}

}
