package com.day8.six;

public class BankAccount {
	// 1. 멤버변수
	private int balance; // 원금, 잔액
	public static final double INTEREST = 0.03; // 이자율
	private static int totalBalance; // 각 계좌의 원금의 합계
	
	// 2. 생성자
	BankAccount(int balance){
		this.balance = balance;
	}
	
	// 3. getter / setter
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// static 변수의 getter/setter
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public static void setTotalBalance(int totalBalance) {
		BankAccount.totalBalance = totalBalance;
		
		// static은 객체 생성전 만들어지기 때문에 this를 사용할 수 없다.
	}
	
	// 4. method
	public void findTotal() {
		totalBalance += balance;
	}
}
