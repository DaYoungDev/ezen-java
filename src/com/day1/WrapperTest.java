package com.day1;

public class WrapperTest {

	public static void main(String[] args) {
		/*
		 Wrapper 클래스
		  - 자료형 대체 클래스
		  - 기본형 변수들도 객체로 다루어져야 하는 경우
		  Boolean/Character/Byte/Short/Integer/Long/Float/Double 
		 */
		byte b_min = Byte.MIN_VALUE; // -128
		byte b_max = Byte.MAX_VALUE; // 127
		
		int i_min = Integer.MIN_VALUE;
		int i_max = Integer.MAX_VALUE + 1; // int의 범위를 벗어나므로,
											// garbage값이 들어감
		
		char C_min = Character.MIN_VALUE;
		char C_max = Character.MAX_VALUE;
		
		System.out.println("byte min = " + b_min);
		System.out.println("byte max = " + b_max);
		
		System.out.println("int min = " + i_min);
		System.out.println("int max = " + i_max);
		
		System.out.println("char min = " + (int)C_min); // null => 0
		System.out.println("char max = " + (int)C_max);
		
		System.out.println("bytes : " + Integer.BYTES); // 4
		System.out.println("type : " + Integer.TYPE); // int
		System.out.println("size : " + Integer.SIZE); // 32
		
	}

}
