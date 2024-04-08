package com.day7;

public class Score2 {

	// 필드
	int korea;
	int english;
	int math;
	
	// 총점, 평균(결과값)도 멤버변수로
	int sum; // 총점 
	double avg; // 평균
	
	// 생성자
	Score2(int k, int e, int m){
		korea = k;
		english = e;
		math = m;
	}
	
	// 메소드
	// 총점 구하는 메소드 정의
	public void totalSum() {
		sum = korea + english + math;
	}
	
	public void totalAvg() {
		totalSum();
		avg = sum / 3.0;
	}
	
}
