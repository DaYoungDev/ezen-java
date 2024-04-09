package com.day8;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변과 높이를 입력하세요");
		int width = sc.nextInt();
		int height = sc.nextInt();
				
		// 생성자를 이용한 멤버변수 초기화
		Triangle tr = new Triangle(width, height);
		int area = tr.findArea();
		System.out.println("삼각형 면적 : " + area);
		
		// setter를 이용하여 멤버변수 값 변경
		System.out.println("새로운 밑변과 높이를 입력하세요");
		width = sc.nextInt();
		height = sc.nextInt();
		tr.setWidth(width);
		tr.setHeight(height);
		
		area = tr.findArea();
		System.out.println("변경된 삼각형 밑변 : " + tr.getWidth());
		System.out.println("변경된 삼각형 높이 : " + tr.getHeight());
		System.out.println("삼각형 면적 : " + area);
		
	}

}
