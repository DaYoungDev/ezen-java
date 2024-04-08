package com.day7;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시, 분, 초를 입력하세요");
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		Time t1 = new Time(h, m, s);
		t1.printTime();
		int result1 = t1.transSecond();
		System.out.println("초로 환산하면 " + result1 + "초");
		
		Time t2 = new Time(h, m);
		t2.printTime();
		int result2 = t2.transSecond();
		System.out.println("초로 환산하면 " + result2 + "초");
		
		Time t3 = new Time(h);
		t3.printTime();
		int result3 = t3.transSecond();
		System.out.println("초로 환산하면 " + result3 + "초");
		
	}

}
