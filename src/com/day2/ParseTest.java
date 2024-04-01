package com.day2;

public class ParseTest {

	public static void main(String[] args) {
		// 1.
		// public static double parseDouble(String s)
		// Integer.parseInt()
		// => 문자열을 숫자로 변환
		String a = "123";
		//int b = (int)a; // error : Cannot cast from String to int
		int b = Integer.parseInt(a);
		System.out.println(a + 10); // 문자열 연결
		System.out.println(b + 10); // 더하기 연산
		
		// 2.
		// public static String toString(double d)
		// Integer.toString()
		// => 숫자를 문자열로 변환
		int i = 567;
		String s = Integer.toString(i);
		System.out.println(i + 10); // 더하기 연산
		System.out.println(s + 10); // 문자열 연결
		
		char ch = 'A';
		s = Character.toString(ch);
		
		boolean bool = true;
		s = Boolean.toString(bool);
		
		// public static String valueOf(int i)
		// => 숫자를 문자열로 변환
		s = String.valueOf(i);
		s = String.valueOf(ch);
	}

}
