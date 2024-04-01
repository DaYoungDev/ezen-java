package com.day2;

public class ConversionTest3 {

	public static void main(String[] args) {
		byte a = 10, b = 20, c;
		// c = a + b; // error
		// Type mismatch: cannot convert from int to byte
		/*
		 cpu는 int형 정수연산을 가장 고속으로 처리하게끔 설계되어 있다
		 따라서 정수형 연산을 진행할 때, 모든 피연산자를 int형으로 변환하는
		 과정을 거침
		 */
		int d = a + b; // byte + byte => int + int => int
		System.out.println("d = " + d);
		
		long x = 300;
		int y = 50;
		long z = x + y; // long + int => long + long => long 
		System.out.println("z = " + z);
		
		/*
		  # 연산의 경우
		  1) int보다 크기가 작은 자료형은 int로 형변환후에 연산
		  2) int보다 큰 자료형은
		  	피연산자 중 가장 큰 자료형으로 형변환된 후 연산
		 */
		
		byte i = 127;
		short j = 32000;
		int k = 2100000000;
		long m = (long)i * j * k;
		long n = (long)(i * j * k); // gabage
		System.out.println("m = " + m + "\nn = " + n);
		
		long p = Long.MAX_VALUE;
		int u = (int)p; // overflow발생, gabage
		System.out.println("p = " + p + ", u = " + u);
	}

}
