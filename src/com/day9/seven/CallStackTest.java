package com.day9.seven;

public class CallStackTest {
	/*
	 자바가상머신은 메모리 공간을 크게 세 개의 영역으로 나누어 관리함
	 1. 메소드영역 - 메소드의 바이트코드, static 변수
	 2. 스택영역 - 지역변수, 매개변수
	 3. 힙영역 - 인스턴스
	 
	 스택영역 - 호출 스택
	 - 호출스택에 호출된 메소드를 위한 메모리가 할당됨
	 - 메소드가 작업을 마치면 할당되었던 메모리 공간은 반환되어 비워짐
	 - 호출스택의 제일 위에 있는 메소드가 현재 실행중인 메소드
	 - 아래에 있는 메소드가 바로 위의 메소드를 호출한 메소드이다 
	 */
	public static void main(String[] args) {
		int a = 10;
		firstMethod();
	}

	private static void firstMethod() {
		int a = 30, b = 20;
		secondMethod(a);
	}
	
	private static void secondMethod(int a) {
		System.out.println("secondMethod(), a = " + a);
	}
}
