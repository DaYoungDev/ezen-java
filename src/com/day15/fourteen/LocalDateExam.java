package com.day15.fourteen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExam {

	public static void main(String[] args) {
		LocalDate birth = LocalDate.of(1997, 3, 17);
		LocalDate now = LocalDate.now();
		LocalDate finish = LocalDate.of(2024, 7, 25);
		LocalDate fix = LocalDate.of(2024, 1, 1);
		
		long betweenDay = ChronoUnit.DAYS.between(birth, now);
		System.out.println("생일이후 경과 일수 : " + betweenDay);
		
		betweenDay = ChronoUnit.DAYS.between(now, finish);
		System.out.println("수료일까지 남은 일수 : " + betweenDay);
		
		LocalDate before = now.minusDays(100);
		System.out.println("100일 전 : " + before);
		
		LocalDate after = fix.plusWeeks(2);
		System.out.println("기준일 2주후 날짜 : " + after);
	}

}
