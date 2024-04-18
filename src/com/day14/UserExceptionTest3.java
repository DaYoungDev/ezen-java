package com.day14;

class MyException extends Exception{
	private final int errorCode = 100;
	
	public MyException(String msg) {
		super(msg);
	}
	
	public int getCode() {
		return errorCode;
	}
}


public class UserExceptionTest3 {

	public static void method() throws MyException{
		throw new MyException("사용자 정의 예외가 발생함");
	}
	
	public static void main(String[] args) {
		try {
			method();
		} catch(MyException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			System.out.println("에러 코드 : " + e.getCode());
			e.printStackTrace();
		}
		
		System.out.println("\n==================");
	}

}
