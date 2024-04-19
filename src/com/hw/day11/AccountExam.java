package com.hw.day11;

import java.util.Scanner;

class Account{	
	protected String accNo;
	protected double balance;

	public Account(String accNo, double balance){
		this.accNo = accNo;
		this.balance = balance;
	}

	public void deposit(double money){   //입금
		balance += money;
	}
	
	public void withdraw(double money){  //출금
		balance -= money;
	}
	
	public void display(){
		System.out.println("계좌번호:"+accNo);
		System.out.println("계좌잔액:"+balance);
	}
}

class FaithAccount extends Account{	
	public FaithAccount(String accNo, double balance) {
		super(accNo, balance+balance*0.01);
	}

	public void deposit(double money){   //입금
		super.deposit(money+money*0.01);
	}
}

class ContriAccount extends Account{	
	private double contribution; //기부금 총액

	public ContriAccount(String accNo, double balance) {
		super(accNo, balance-balance*0.01);
		contribution = balance*0.01;
	}

	public void deposit(double money) {  //입금
		super.deposit(money-money*0.01);
		contribution += money*0.01;
	}

	public void display(){
		super.display();
		System.out.println("총기부액:"+contribution);
	}
}

class AccountExam{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("개설할 계좌종류-일반계좌(A),신용계좌(F),기부계좌(C), 계좌번호, 입금액을 입력하세요");

		String accType = sc.nextLine();
		String accNo = sc.nextLine();
		int balance = sc.nextInt();

		System.out.println("====================================");

		Account a = null;
		if (accType.equalsIgnoreCase("A")){
			a = new Account(accNo, balance);
		}else if (accType.equalsIgnoreCase("F")){
			a = new FaithAccount(accNo, balance);
		}else if (accType.equalsIgnoreCase("C")){
			a = new ContriAccount(accNo, balance);
		}
		a.display();
		
		System.out.println("입금할 금액을 입력하세요");
		int money = sc.nextInt();
		a.deposit(money);
		a.display();
	}
}
