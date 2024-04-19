package com.day15.Account;

public class NormalAccount extends Account{

	private double rate;
	
	public NormalAccount(String accNo, String name, int balance, int rate) {
		super(accNo, name, balance);
		this.rate = rate / 100.0;
	}
	
	public void deposit(int money) {
		super.deposit(money + (int)(money * rate));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("이자율 : " + (int)(rate * 100) + "%");
	}
	
	
}
