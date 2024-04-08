package com.day7;

import java.util.Scanner;

public class ClassExam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cc = new Calculator();
		
		System.out.println("두 실수를 입력하세요");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("a = " + a + ", b = " + b);
		cc.puls(a, b);
		cc.minus(a, b);
		cc.multiply(a, b);
		cc.divide(a, b);
		System.out.println();
		
		Rectangle rec = new Rectangle();
		System.out.println("사각형의 가로, 세로를 입력하세요");
		
		rec.width = sc.nextInt();
		rec.length = sc.nextInt();
		
		System.out.println("사각형의 넓이 : " + rec.recArea());
		System.out.println("사각형의 둘레 : " + rec.recRound());
		
		
		System.out.println("\n사각형의 가로, 세로를 다시 입력하세요");
		
		Rectangle rec2 = new Rectangle(sc.nextInt(), sc.nextInt());
		
		System.out.println("사각형의 넓이 : " + rec2.recArea());
		System.out.println("사각형의 둘레 : " + rec2.recRound());
		
		
	}

}
