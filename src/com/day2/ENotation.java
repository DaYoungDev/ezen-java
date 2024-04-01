package com.day2;

public class ENotation {

	public static void main(String[] args) {
		// 실수에 대한 e표기법
		double d1 = 1.5e-3; // e표기법, 1.5*10^-3 => 0.0015
		double d2 = 1.5E+3; // 1.5*10^3 => 1500.0
		double d3 = 1.5E3; // 1.5*10^3 '+'는 생략가능
		
		// 정수에 대한 16진수, 8진수 표기법
		int n1 = 0xA0E; // 16진수, - 0x로 시작하면 16진수 표현
		/*
		 10진수 3567 => 3*10^3 + 5*10^2 + 6*10 + 7
		 8진수 125 => 1*8^2 + 2*8^2 + 5 => 10진수 85
		 16진수 A0E => 10*16^2 + 0*16 + 14 => 10진수 2574
		 
		 10 11 12 13 14 15
		 A  B  C  D  E  F
		 */
		int n2 = 0125; // 8진수 - 0으로 시작하면 8진수 표현
		System.out.println("d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3);
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		System.out.println("16진수 표현, n1 = " + Integer.toHexString(n1));
		System.out.println("8진수 표현, n2 = " + Integer.toOctalString(n2));
		
		// 유니코드
		char ch1 = 'A';
		char ch2 = '가';
		char ch3 = 97; // 유니코드값
		char ch4 = 0xACF0;
		char ch5 = 0x3051;
		char ch6 = '\u3051';
		
		System.out.println("ch1 = " + ch1 + ", ch2 = "+ ch2 + ", ch3= " + ch3);
		System.out.println("ch4 = " + ch4 + ", ch5 = "+ ch5 + ", ch6= " + ch6);
	}

}
