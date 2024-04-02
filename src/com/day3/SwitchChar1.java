package com.day3;

import java.io.IOException;

public class SwitchChar1 {

	public static void main(String[] args) throws IOException {
		// char 입력받기
		System.out.println("성별입력하세요 F/M");
		int code = System.in.read();
		// => 사용자가 입력한 아스키코드값을 반환해줌
		// 앞의 1바이트만 읽는다
		char ch = (char)code;
		System.out.println("code = " + code + ", ch = " + ch);
		
		// char gender = (char)System.in.read();
		String result = "";
		switch (ch) {
		case 'm' : 
			result = "남";
			break;
		case 'f' : 
			result = "여";
			break;
		default :
			result = "잘못 입력";
		}
		System.out.println(result);
		
		
		// public static char toUpperCase(char ch)
		// public static char toLowerCase(char ch)
		switch (Character.toLowerCase(ch)) {
		case 'm' : 
			result = "남";
			break;
		case 'f' : 
			result = "여";
			break;
		default :
			result = "잘못 입력";
		}
		System.out.println(result);
	}

}
