package com.day16;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExamLocalDate {

	public static void main(String[] args) {
		LocalDate now2 = LocalDate.now();
		System.out.println(now2);
		LocalDate result3 = now2.minusDays(100);
		System.out.println("100일 전: " + result3);

		LocalDate result4 = now2.plusWeeks(2);
		System.out.println("2주 후: " + result4);
		
		//
		LocalDate startDateTime = LocalDate.of(1999, 1, 30);
		//System.out.println("시작일: " + startDateTime);

		//LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		LocalDate endDateTime = LocalDate.now();
		//System.out.println("종료일: " + endDateTime);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);

		System.out.println("생일이후 경과 일수: " + remainDay);

		//
		LocalDate startDateTime1 = LocalDate.now();
		//System.out.println("시작일: " + startDateTime1);

		LocalDate endDateTime1 = LocalDate.of(2024, 7, 25);
		//System.out.println("종료일: " + endDateTime1);
		remainDay = startDateTime1.until(endDateTime1, ChronoUnit.DAYS);

		System.out.println("수료일까지 남은 일수: " + remainDay);
		
		/////////
		//LocalDate startDate = LocalDate.of(2024, 1, 1);
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.of(2024, 7, 25);

		Period period = Period.between(startDate, endDate);
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("시작 날짜: " + startDate);
		System.out.println("목표 날짜: " + endDate);
		System.out.println("남은 기간: " + period.getYears() + "년 " + 
				period.getMonths() + "개월 " + period.getDays() + "일 ");
		System.out.println("남은 일수: " + daysBetween + "일 남음");
	}

}
