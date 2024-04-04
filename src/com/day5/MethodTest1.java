package com.day5;

public class MethodTest1 {

	/*
	 # 메소드
	 	- 특정기능을 수행하는 최소 실행단위
	 	- 자주 반복하여 사용하는 내용에 대해 특정 이름으로 정의한 묶음
	 	- 필요할때마다 호출하여 원하는 작업을 시킬 수 있음
	 */
	
	// 이자를 계산하는 기능의 메소드
	// 메소드 정의
	// 접근제한자	  반환형	 메소드이름	  매개변수(입력값)	
	public static double calcInterest(int money) {
		double interest = money * 0.032; // 이자 계산
		return interest; // 결과값 반환
	}
	
	/*
	 매개변수(parameter) - 입력값
	 반환형(반환타입, return type) - 결과값의 형태(자료형)
	 */
	
	public static void main(String[] args) {
		// 메소드 호출
		// 반환타입 변수 = 메소드명(인수); // 인수, 인자, argument
		/*
		 # static메소드 호출
		 [1] 같은 클래스에 있는 메소드 호출
		 메소드명();
		 
		 [2] 다른 클래스에 있는 메소드 호출
		 클래스명.메소드명();
		 */
		
		double result = MethodTest1.calcInterest(100000);
		
		// 같은 클래스 내부에 있어서 생략가능
		double result2 = calcInterest(100000); 
		
		System.out.println("이자 : " + result);
		System.out.println("이자 : " + result2);
		
	}

}
