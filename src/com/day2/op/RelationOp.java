package com.day2.op;

public class RelationOp {

	public static void main(String[] args) {
		// 비교 연산자
		/*
		  >, >=, <, <=, ==, !=
		*/
		
		int a = 7; 
		int b = 3;
		boolean bool = (a >= b);
		
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("a >= b : " + bool);
		System.out.println("a == b : " +  (a == b));
		System.out.println("a != b : " +  (a != b));
		System.out.println("a > b : " +  (a > b));
		System.out.println("a < b : " +  (a < b));
		System.out.println("a <= b : " +  (a <= b));

	}

}
