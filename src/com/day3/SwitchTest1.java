package com.day3;

public class SwitchTest1 {

	public static void main(String[] args) {
		/*
		 switch문
		 - 비교할 조건이 많은 경우, 정해져 있는 값을 가진 경우 사용
		  => 비교만 가능, 대소비교는 불가
		  
		switch(){
			case 값1:
				실행블록1;
				break;
			case 값2:
				실행블록2;
				break;
			default:
				실행블록3;
				break;
			
		}
		=> 제어변수의 값이 값1이면 실행블록1을 수행,
		 				값2이면 실행블록2를 수행
		 			나머지 값이면 실행블록3을 수행
		 제어변수 : byte, short, int, char만 사용가능
		 		jdk 7.0 이상 : String도 사용가능
		 		
		 case 다음에는 상수만 쓸 수 있다. 변수나 범위 지정할 수 없다
		*/
		
		// if문
		int g = 2;
		String result = "";
		if(g == 1) {
			result = "남자";
		} else if(g == 2) {
			result = "여자";
		} else {
			result = "잘못입력!";
		}
		System.out.println(result);
		
		// switch문
		switch(g) {
			case 1:
				result = "남";
				break;
			case 2:
				result = "여";
				break;
			default : 
				result = "잘못 입력함!";
		}
		System.out.println(result);
		
		// or 처리
		 g = 3;
		switch(g) {
			case 1:
			case 3:
				result = "남";
				break;
			case 2:
			case 4:
				result = "여";
				break;
			default : 
				result = "잘못 입력함!";
		}
		System.out.println(result);
	}

}
