package com.day15.fourteen;

import java.time.LocalDate;

public class LocalDateTest4 {

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2021, 11, 24);
		LocalDate endDate = LocalDate.of(2023, 9, 17);
		
		//boolean isBefore(ChronoLocalDate other)
		if(startDate.isBefore(endDate)) {
			System.out.println(startDate + "는 " + endDate + "보다 이전 날짜입니다");
		}else if(startDate.isAfter(endDate)) {
			System.out.println("이후 날짜입니다.");
		} else if(startDate.isEqual(endDate)) {
			System.out.println("동일 날짜입니다.");
		}
	}

}
