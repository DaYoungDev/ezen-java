package com.day15.Account;

public class Account {
	private String accNo;
	private String name;
	private int balance;
	
	public Account(String accNo, String name, int balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public int withdrawal(int money) {
		if(money > balance) {
			return 0;
		}
		balance -= money;
		return money;
	}
	
	// 정보출력
	public void showInfo() {
		System.out.println("계좌 : " + accNo);
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance);
	}

}
