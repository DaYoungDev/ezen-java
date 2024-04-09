package com.day8.six;


class StaticBlock{
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1); // 1~10까지의 정수
		}
	}
	/*
		static 초기화 블럭(클래스 초기화 블럭)
		- static 변수의 복잡한 초기화에 사용됨
		- 해당 클래스가 메모리에 로딩될 때 static 변수가 생성되고
			바로 static초기화 블럭이 호출되어 static변수를 초기화함
	
		static{
		}
	 */
	
} // class

public class StaticblockTest {
	public static void main(String[] args) {
		for(int i = 0; i < StaticBlock.arr.length; i++ ) {
			System.out.print(StaticBlock.arr[i] + " ");
		}
	}

} // main class
