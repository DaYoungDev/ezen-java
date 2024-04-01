package com.day1;

public class Test2 {

	public static void main(String[] args) {
		// 3. 변수 선언하고 출력하기
		char ch = 'A';
		float f = 3.14f;
		double d = 3.14;
		byte b = 127;
		short s = 26000;
		long l = 36000000000l;
		String str = "참조형";
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("char형 출력 : " + ch);
		System.out.println("float형 출력 : " + f);
		System.out.println("double형 출력 : " + d);
		System.out.println("byte형 출력 : " + b);
		System.out.println("short형 출력 : " + s);
		System.out.println("long형 출력 : " + l);
		System.out.println("String형 출력 : " + str);
		System.out.println("boolean형 출력 : " + bool1);
		System.out.println("boolean형 출력 : " + bool2);
		System.out.println();
		
		// 4. 사용자 아이디, 비밀번호 변수 저장 후 출력
		String id = "hong";
		String passWord = "1234";
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + passWord);
	}

}
