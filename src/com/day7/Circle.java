package com.day7;
/*
 클래스란?
 [1] 객체지향이론의 관점에서
 클래스는 객체를 생성하기 위한 틀이며, 속성과 기능으로 구성되어 있다
 [2] 프로그래밍관점에서
 클래스는 자료형을 정의하는 것으로, 관련된 변수와 메소드들을 함께 정의하는 것
 (사용자정의 자료형, 참조형)
 */

public class Circle {
	// 1. 멤버변수(필드)
	int radius; // 반지름
	
	// 2. 메소드
	// 2-1. 넓이 구하는 메소드
	public double findArea() {
		double area = radius * radius * 3.14;
		return area;
	}
	
	// 2-2. 둘레를 구하는 메소드
	public double findGirth() {
		double girth = radius * 2 * Math.PI;
		return girth;
	}
}
