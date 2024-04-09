package com.day8;

import java.util.Scanner;

public class TemporaryTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 일한시간, 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary man1 = new Temporary(name, time, pay);
		int totalPay = man1.totalPay();
		System.out.println("-----------------\n고용형태 : 임시직");
		System.out.println("이름 : " + man1.getName());
		System.out.println("급여 : " + totalPay);
		
	}

}
