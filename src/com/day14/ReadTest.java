package com.day14;

import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) throws IOException {
		// int read() throws IOException
		System.out.println("성별을 입력하세요 F/M");
		char gender = (char)System.in.read();
		
		String result = "";
		result = switch(gender) {
			case 'M' -> "남자";
			case 'F' -> "여자";
			default -> "잘못 입력"; 
		};
		
		System.out.println(result);
	}

}
