package com.hw.day3;

import java.io.IOException;

public class IfHw2 {

	public static void main(String[] args) throws IOException   {
		System.out.println("0~9나 알파벳, 그외 문자를 입력하세요");
		char v=(char)System.in.read();
		System.out.println("입력한 값: "+v);

		String result="";
		if(v>='0' && v<='9')
			result="숫자입니다";
		else if((v>='A'&& v<='Z') ||(v>='a'&&v<='z'))
			result="알파벳 문자입니다";
		else
			result="기타 문자입니다";

		System.out.println(result);

		//2.
		System.out.println("\n0~9나 알파벳, 그외 문자를 입력하세요");
		System.in.skip(2); //\r\n,  13,10
		int n=System.in.read(); //아스키 코드값 리턴
		// 0 ~9 : 48 ~ 57
		// A~Z : 65 ~ 90
		// a~z : 97 ~ 122
		if(n >=48 && n<=57)
			result="숫자입니다";
		else if((n>=65 && n<=90) || (n>=97 && n<=122))
			result="알파벳입니다";
		else
			result="기타 문자입니다";

		System.out.println(result);

		//
		System.in.skip(2);
		System.out.println("\n0~9나 알파벳, 그외 문자를 입력하세요");
		char ch=(char)System.in.read();

		if(Character.isDigit(ch))
			result="숫자입니다";
		//else if(Character.isUpperCase(ch)||Character.isLowerCase(ch))
		//else if(Character.isAlphabetic(ch))  //jdk7.0
		else if(Character.isLetter(ch))
			result="알파벳 문자입니다";
		else
			result="기타 문자입니다";

		System.out.println(result);

		//
		//Character클래스의 메소드
		//static boolean isDigit(char ch) : 매개변수로 받아 들인 문자가 숫자이면 true를, 
		//숫자가 아니면 false를 반환함
		boolean bool=Character.isDigit(ch);
		System.out.println("bool="+bool);
		if(bool==true)
			System.out.println("숫자입니다");
		else
			System.out.println("숫자가 아닙니다.");
	}

}
