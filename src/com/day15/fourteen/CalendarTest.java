package com.day15.fourteen;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance(); 
		int x = ca.get(Calendar.DAY_OF_YEAR);
		System.out.println("오늘은 일년중 " + x + "번째 날입니다."); 
		
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH);
		//int day = ca.get(Calendar.DAY_OF_MONTH);
		int day2 = ca.get(Calendar.DATE);
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		int minute = ca.get(Calendar.MINUTE);
		int second = ca.get(Calendar.SECOND);
		int weekday = ca.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("year : " + year);
		System.out.println("month(0~11) : " + month);  //month+1 해야 함
		System.out.println("day : " + day2);
		System.out.println("hour(0~23) : " + hour);
		System.out.println("minute(0~59) : " + minute);
		System.out.println("second(0~59) : " + second);
		System.out.println("요일(1~7, 1:일요일) : " + weekday);
		System.out.println("ca : " + ca.getTime());	

	}

}
