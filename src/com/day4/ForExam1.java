package com.day4;

public class ForExam1 {

	public static void main(String[] args) {
		// for문을 이용하여 알파벳 소문자(a~z) 출력하기
		for(int i = 97; i < 123; i++) {
			if(i == 122) {
				System.out.println((char)i);
				break;
			}
			System.out.print((char)i + ", ");
		}
		
		// 1. 방법 1
		char lowerCase = 'a';
		for (int i = 1; i <= 26; i++) {
			System.out.print(lowerCase++);
			if(i != 26) {
				System.out.print(", ");
			}
		}
		
	}

}
