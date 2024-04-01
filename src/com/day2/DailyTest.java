package com.day2;

public class DailyTest {

	public static void main(String[] args) {
		System.out.println("------------");
		System.out.println("안녕! 자바");
		System.out.println();
		System.out.println();
		System.out.println("Hello jsp!");
		System.out.println();
		System.out.println();
		System.out.println("Hi Spring!!");
		System.out.println("------------");
		
		
		int a;
		a = 3;
		
		int b = 5;
		
		int c, d;
		c = 11;
		d = 13;
		
		int e = 7, f = 9;
		
		System.out.print("[연도 - 2020년]");
		System.out.print("[월 - 3월]");
		System.out.print("[일 - 11일]");
		
		String number = "900102-1112222";
		System.out.println("주민번호 : " + number);
		
		int count = 3;
		double price = 2.5;
		System.out.println("수량 : " + count + ", 금액 : " + price);
		
		float fl;
		fl = 3.14f;
		char ch = 'a';
		long l1, l2;
		l1 = 10000l;
		l2 = 20000l;
		String str1 = "Hi", str2 = "bye";
		
		short z=30000;
		int y = 2100000000; 

		long x = z*y; //

		//byte w=128; // -127
		int m=Integer.MAX_VALUE; 
		int n=m+1;   // gabage

		System.out.println("x="  + x);
		System.out.println("n="  + n);
		
		String title = "제목";
		String day = "2024-04-01";
		int view = 3;
		String email = "ezen@naver.com";
		
		System.out.println("제목 : " + title);
		System.out.println("글쓴날짜 : " + day);
		System.out.println("조회수 : " + view);
		System.out.println("이메일 : " + email);

	}

}
