package com.day8.six;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(50000);
		ba1.findTotal();
		
		BankAccount ba2 = new BankAccount(100000);
		ba2.findTotal();
		
		BankAccount ba3 = new BankAccount(200000);
		ba3.findTotal();
				
		System.out.println("계좌1의 원금 : " + ba1.getBalance());
		System.out.println("계좌2의 원금 : " + ba2.getBalance());
		System.out.println("계좌3의 원금 : " + ba3.getBalance());
		
		System.out.println("모든 계좌의 이율 : " + BankAccount.INTEREST);
		// static 변수 - 클래스명.변수
		
		System.out.println("\n모든 계좌의 원금의 합계 : " + BankAccount.getTotalBalance());
		// static method 호출 - 클래스명.메소드();
		
	}

}
