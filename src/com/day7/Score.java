package com.day7;

public class Score {

	// 필드
	int korea;
	int english;
	int math;
	
	// 생성자
	Score(int korea, int english, int math){
		this.korea = korea;
		this.english = english;
		this.math = math;
		
		System.out.println("this = " + this);
	}
	
	/*
	  this - 자기 자신을 가리키는 this
	  	   - 자신의 멤버를 가리키는 this (this.멤버)
	  	   - 인스턴스 자신을 기리키는 참조변수
	  	   - 인스턴스의 주소가 저장되어 있음
	 */
	
	// 메소드
	// 총점 구하는 메소드 정의
	public int totalSum() {
		int sum = korea + english + math;
		return sum;
	}
	
	public double totalAvg() {
		double avg = totalSum() / 3.0;
		return avg;
	}
	
}
