package com.day16;

public class MathTest {

	public static void main(String[] args) {
		
		System.out.println("abs(-27.5) : "+ Math.abs(-27.5));
		System.out.println("abs(27.5) : "+ Math.abs(27.5));
		
		/*
		 -28	-27.3	-27		0	27.3		28
		 -28	-27.6	-27		0	27	  27.6	28
		 
		 양수인 경우 올림의 경우 27.6은 28이 되겟지만
		 음수인 경우 -27.6d은 -27이 된다
		 */
		
		System.out.println("ceil(-27.3):"+ Math.ceil(-27.3));
		System.out.println("ceil(27.3):"+ Math.ceil(27.3));
		
		System.out.println("floor(-27.6):"+ Math.floor(-27.6));
		System.out.println("floor(27.6):"+ Math.floor(27.6));
		
		System.out.println("round(34.5374):"+ Math.round(34.5374));  //반올림(소수1째 자리에서
		
		System.out.println("Math.E: "+ Math.E);
		System.out.println("Math.PI: "+ Math.PI );
	}
}