package com.day14;

import java.util.Scanner;

class UserException extends Exception{
	private final int errorCode = 100;

	public UserException(String msg) {
		super(msg);
	}
	
	public int getErrorCode() {
		return errorCode;
	}

}

public class UserExceptionExam1 {

	public static void callUser() throws UserException{
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String pNumber = sc.next();

		if(pNumber.length() != 14) {
			throw new UserException("14자리를 입력하세요");
		} else {
			System.out.println("주민번호 : " + pNumber);
		}

	}

	public static void main(String[] args) {
		
		try {
			callUser();
		} catch (UserException e) {
			System.out.println("에러메세지 : " + e.getMessage());
			System.out.println("에러 코드 : " + e.getErrorCode());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}

}
