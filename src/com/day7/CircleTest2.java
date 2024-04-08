package com.day7;

import java.util.Scanner;

public class CircleTest2 {

	public static void main(String[] args) {
		// 객체 생성과 동시에 기본생성자로 필드 초기화
		Circle2 c = new Circle2(10); // 생성자에 의해 멤버변수값 초기화
		
		// 메소드 호출
		double area = c.findArea();
		System.out.println("원의 넓이 : " + area);
		
		
		// 멤버변수 값 변경
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력");
		c.radius = sc.nextInt();
		
		System.out.println("변경 후 원의 면적 : " + c.findArea());
	}

}
