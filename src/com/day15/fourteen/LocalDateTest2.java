package com.day15.fourteen;

import java.time.LocalDateTime;

public class LocalDateTest2 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		
		int year = today.getYear();
		System.out.println("년도 : " + year);
		System.out.println("월 : " + today.getMonth());
		System.out.println("일 : " + today.getDayOfMonth());
		System.out.println("요일 : " + today.getDayOfWeek());
		System.out.println("1년중 며칠째 : " + today.getDayOfYear());
		
		System.out.println("시 : " + today.getHour());
		System.out.println("분 : " + today.getMinute());
		System.out.println("초 : " + today.getSecond());
		System.out.println("나노초 : " + today.getNano());
	}

}
