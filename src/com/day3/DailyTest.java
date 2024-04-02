package com.day3;

import java.util.Scanner;

public class DailyTest {

	public static void main(String[] args) {
		System.out.println("d:\\exam\\test1.txt");
		System.out.println("Hello \t \"Html\"");
		System.out.println("Hello \nSpring\n");
		System.out.println("\nHi \nJsp!");
		
		
		int a = 6;
		double b = 3.14;
		byte c = 2;
		
		double d1 = a + b + c;
		
		double e = 3.17;
		long f = (long)e;
		
		String s = "4560";
		int k = Integer.valueOf(s);
		
		k = 378;
		String s1 = Integer.toString(k);
		
		double d = 17.23456;
		double i = d * 100;
		int j = (int)i;
		double result = j / 100.0;
		System.out.println(result);
		
		
		int k1 = 97;
		char k2 = (char) k1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력하세요");
		int width = sc.nextInt();
		System.out.println("높이를 입력하세요");
		int height = sc.nextInt();
		
		int area = width * height / 2;
		System.out.println("삼각형의 면적은 : " + area);
		
		int rest = 19 % 3;
		
		char b1 = 'B';
		int change = 32;
		System.out.println("소문자로 출력 : " + (char)(b1 + change));
		
		char ch = 'd';
		int ch1 = ch;
		char ch2 = (char)(ch1 + 3);
		System.out.println(ch2);
		
		int i1 = 66;
		char i2 = (char)i1;
		System.out.println(i2);
		

		
	}

}
