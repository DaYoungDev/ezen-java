package com.day15.fourteen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest1 {

	public static void main(String[] args) {
		// public static LocalDate now()
		LocalDate lDate = LocalDate.now();
		System.out.println("현재 날짜 : " + lDate);
				
		LocalTime lTime = LocalTime.now();
		System.out.println("현재 시간 : " + lTime);
		
		LocalDateTime idt = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + idt);
		
		// 날짜 지정
		LocalDate ofDate = LocalDate.of(2023, 5, 12);
		System.out.println("지정한 날짜 : " + ofDate);
		LocalTime ofTime = LocalTime.of(14, 20, 50);
		System.out.println("지정한 날짜 : " + ofTime);
		LocalDateTime ofDt 
		= LocalDateTime.of(2021, 10, 24, 19, 15, 30);
		System.out.println("지정한 날짜 : " + ofDt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String sDate = ofDt.format(dtf);
		System.out.println("format이용한 날짜 : " + sDate);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		sDate = ofDt.format(dtf2);
		System.out.println("\nformat이용한 날짜2 : " + sDate);
		
		sDate = ofDt.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("\nformat이용한 날짜3 : " + sDate);
	}

}
