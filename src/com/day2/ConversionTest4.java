package com.day2;

public class ConversionTest4 {

	public static void main(String[] args) {
		// byte, short 선언 > short - byte 연산
		byte a = 32;
		short b = 12000;
		int c = b - a;
		System.out.println("c : " + c);
		
		// int, long 선언 > long * int 연산
		int d = 32000;
		long e = 280000000l;
		long f = e * d;
		System.out.println("f : " + f);
		
		// long 선언 > double 캐스팅
		long g = 4500l;
		double h = (double)g;
		System.out.println("h : " + h);
		
		// float 선언 > long 캐스팅
		float i = 3.14f;
		long j = (long)i;
		System.out.println("j : " + j);
		
		// char 선언 > int 캐스팅
		char k = 'A';
		int l = (int)k;
		System.out.println("l : " + l);
	}

}
