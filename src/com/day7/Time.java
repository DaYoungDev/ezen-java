package com.day7;

public class Time {
	// 필드
	int hour;
	int minute;
	int second;
	
	// 생성자
	Time(int h){
		hour = h;
	}
	Time(int h, int m){
		hour = h;
		minute = m;
	}
	Time(int h, int m, int s){
		hour = h;
		minute = m;
		second = s;
	}
	
	// 메소드
	// 출력 메소드
	public void printTime() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

	// 초단위 메소드
	public int transSecond() {
		return (hour * 60 * 60) + (minute * 60) + second;
	}
}
