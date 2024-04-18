package com.day14;

public class ThrowsTest2 {
	public static void method1() throws Exception{
		method2();
	}
	private static void method2() throws Exception{
		throw new Exception("고의로 예외 발생시켰음");
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
	}

}
