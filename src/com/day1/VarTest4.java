package com.day1;

public class VarTest4 {

	public static void main(String[] args) {
		// 문자형
		char ch = 'A'; // 반드시 작은 따옴표로 감싸야 함, 영어는 한글자가 1byte
		// 실제로는 A에 해당하는 유니코드값인 65가 들어감
		char a = '가'; // 한글은 1글자가 2byte
		//char b = 'abc'; // error, char는 문자 하나만 저장
		System.out.println("ch=" + ch + ", a=" + a);
		
		System.out.println(ch + 1); // ch+1 => 65 + 1 =>66
		int c = ch + 2; // 65 + 2 => 67
		System.out.println(c);
		
		char d = (char)c; // 유니코드 67에 해당하는 문자인 C
		System.out.println(d);
		
		char e = 65; // 유니코드값을 넣어도 됨 'A' => 65
		System.out.println(e); // A
		System.out.println((int)ch); // A => 65
	}

}
