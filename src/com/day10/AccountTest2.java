package com.day10;

import java.util.Scanner;

class Account1{
	final static double INTEREST_RATE = 0.03;
	
	public int interest(int balance) {
		return (int)(balance * INTEREST_RATE);
	}
}


public class AccountTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요.");
		int balance = sc.nextInt();
		
		Account1 a = new Account1();
		System.out.println("============");
		System.out.println("원금 : " + balance 
				+ "원, 이자율 :" + Account1.INTEREST_RATE 
				+ ", 이자 : " + a.interest(balance));
	}

}
