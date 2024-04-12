package com.day9.seven;

/*
 # 오버라이딩의 조건
 1. 메소드의 선언부는 부모의 것과 완전히 일치해야 함
 2. 접근제한자는 부모메소드보다 좁은 범위로 변경할 수 없음
 3. 부모메소드보다 많은 수의 예외를 선언할 수 없음
 */

class Shape{
	public void draw() {
		System.out.println("도형을 그리는 메소드");
	}
}

class Triangle extends Shape{
	public void draw() { // 오버라이딩 메소드
		System.out.println("삼각형을 그린다.");
	}
	
}

class Circle extends Shape{
	public void draw() { // 오버라이딩 메소드
		System.out.println("원을 그린다.");
	}
	
}
public class OverridingTest2 {
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.draw();
		
		Circle c = new Circle();
		c.draw();
	}

}
