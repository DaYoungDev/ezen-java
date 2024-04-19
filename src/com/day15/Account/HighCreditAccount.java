package com.day15.Account;

public class HighCreditAccount extends NormalAccount implements SRate{
	private double sRate;
	
	public HighCreditAccount(String accNo, String name, int balance,
			int rate, int countRate) {
		super(accNo, name, balance, rate);
		if(countRate == 1) {
			this.sRate = SRate.a;
		} else if(countRate == 2) {
			this.sRate = SRate.b;
		} else if(countRate == 3) {
			this.sRate = SRate.c;
		}
	}
	
	public void deposit(int money) {
		super.deposit(money + (int)(money * sRate));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("특별이자율 : " + (int)(sRate * 100) + "%");
	}
}
