package com.day15.fourteen;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTest5 {

	public static void main(String[] args) {
		//LocalDate -> String
		String s=LocalDate.of(2020, 12, 12).format(DateTimeFormatter.BASIC_ISO_DATE); // 20201212 
		System.out.println(s);
		
		//LocalDateTime -> String
		LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); // 2018-07-26 00:42:24 
		
		//LocalDateTime -> java.util.Date
		java.util.Date dd=Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()); //Thu Jul 26 01:00:30 KST 2018
		System.out.println(dd); 
		
		//LocalDate -> java.sql.Date
		Date d2= Date.valueOf(LocalDate.of(2015, 5, 5)); // 2018-07-26 
		System.out.println(d2);
		
		//LocalDateTime -> java.sql.Timestamp
		Timestamp t=Timestamp.valueOf(LocalDateTime.now()); // 2018-07-26 01:06:55.323 
		System.out.println(t);
		
		//String -> LocalDate
		LocalDate ld= LocalDate.parse("2002-05-09"); // 2002-05-09
		LocalDate ld2=LocalDate.parse("20081004", DateTimeFormatter.BASIC_ISO_DATE); // 2008-10-04 
		System.out.println(ld +", " + ld2);
		
		//String -> LocalDateTime
		LocalDateTime ldt= LocalDateTime.parse("2007-12-03T10:15:30"); // 2007-12-03T10:15:30
		LocalDateTime ldt2=LocalDateTime.parse("2010-11-25 12:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); // 2010-11-25T12:30
		System.out.println(ldt +", " + ldt2);
		
		//java.util.Date -> LocalDateTime
		LocalDateTime ldt3=LocalDateTime.ofInstant(new java.util.Date().toInstant(), ZoneId.systemDefault()); // 2018-07-26T01:16:46.755
		
		// java.sql.Date -> LocalDate
		LocalDate ld3= new Date(System.currentTimeMillis()).toLocalDate(); // 2018-07-26 
		System.out.println(ldt3 +", " + ld3);
		
		//java.sql.Timestamp -> LocalDateTime
		LocalDateTime ldt4 = new Timestamp(System.currentTimeMillis()).toLocalDateTime(); // 2018-07-26T01:20:07.364
		
		//LocalDateTime -> LocalDate
		LocalDate ld4=LocalDate.from(LocalDateTime.now()); // 2018-07-26 
		System.out.println(ldt4 +", " + ld4);
		
		//LocalDate -> LocalDateTime
		LocalDateTime ldt5 =LocalDate.now().atTime(2, 30); // 2018-07-26T02:30 
		System.out.println(ldt5);

	}
}
