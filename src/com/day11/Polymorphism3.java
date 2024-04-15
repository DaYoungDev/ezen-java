package com.day11;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("도형을 그리는 메소드");
	}

	public void delete() {
		System.out.println("도형을 지우는 메소드");
	}

	public void parentFunc() {
		System.out.println("부모 메소드");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다");
	}

	public void delete() {
		System.out.println("원을 지웁니다");
	}

	public void saycircle() {
		System.out.println("원 메소드");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형을 그립니다");
	}

	public void delete() {
		System.out.println("삼각형을 지웁니다");
	}

	public void sayTriangle() {
		System.out.println("삼각형 메소드");
	}
}

public class Polymorphism3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요 (1.원 2.삼각형)");
		int type = sc.nextInt();
		if(type == 1 || type == 2) {
			Shape sh = createshape(type);
			sh.draw();
		} else {
			System.out.println("잘못 입력되었습니다.");
			return;
		}
		
		// Circle 배열
		Circle[] cArr = new Circle[2];
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = new Circle();
			cArr[i].draw();
		}
		
		// Shape 배열
		Shape[] shArr = new Shape[3];
		shArr[0] = new Circle(); // 부모 배열에는 자식 객체를 넣는다.
		shArr[1] = new Triangle();
		shArr[2] = new Circle();
		
		System.out.println("\n=====다형성 이용 - 배열==========");
		for(int i = 0; i < shArr.length; i++) {
			shArr[i].draw();
			shArr[i].delete();
		}
	}

	public static Shape createshape(int type) {
		Shape s = null;

		if(type == 1) {
			s = new Circle();
		} else if(type == 2) {
			s= new Triangle();
		} else {
			return null;
		}
		
		return s;
	}

}
