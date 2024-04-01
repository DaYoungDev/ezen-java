package com.day2.op;

public class IncrementOp2 {

	public static void main(String[] args) {
		// 수식에 포함되는 경우 
		int i = 5;
		int k = 0;
		k = i++;
		System.out.println("후증가 i = " + i + ", k = " + k);
		
		i = 5;
		k = 0;
		k = ++i;
		System.out.println("선증가 i = " + i + ", k = " + k);
		
		//
		int a = 3, b = 3;
		
		System.out.println("\na = " + a + ", b = " + b);
		System.out.println("선증가 a = " + ++a);
		System.out.println("후증가 b = " + b++);
		System.out.println("최종 a = " + a + ", b = " + b);
		
		
	}

}
