package com.day15.fourteen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest3 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		// [1]오늘날짜에 더하고 빼기
		LocalDateTime resultDate1 = now.plusYears(3);
		System.out.println("3년 후 : " + resultDate1);

		LocalDateTime resultDate2 = now.plusDays(100);
		System.out.println("100일 후 : " + resultDate2);

		LocalDateTime resultDate3 = now.minusMonths(5);
		System.out.println("5개월 전 : " + resultDate3);

		LocalDateTime resultDate4 = now.minusWeeks(7);
		System.out.println("7주 전 : " + resultDate4);
		System.out.println();

		// [2] 두 날짜 사이의 간격, 크리스마스까지 몇일 남았는지
		// long until(Temporal endExclusive, TemporalUnit unit)
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.of(2024, 12, 25);

		long remainDay = startDate.until(endDate, ChronoUnit.DAYS);
		System.out.println("크리스마스까지 남은 일수 : " + remainDay);

		long remainYear = startDate.until(endDate, ChronoUnit.YEARS);
		System.out.println("크리스마스까지 남은 년수 : " + remainYear);

		long remainMonth = startDate.until(endDate, ChronoUnit.MONTHS);
		System.out.println("크리스마스까지 남은 개월수 : " + remainMonth);

		//Period between(LocalDate startDateInclusive, LocalDate endDateExclusive)
		Period period = Period.between(startDate, endDate);
		System.out.println("크리스마스까지 남은 기간 : " 
				+ period.getYears() + "년 " 
				+ period.getMonths() + "개월 " 
				+ period.getDays() + "일");
		
		// long ChronoUnit.between(Temporal temporal1Inclusive, Temporal temporal2Exclusive)
		long gap = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("\n크리스마스까지 남은 일수 : " + gap);
	}

}
