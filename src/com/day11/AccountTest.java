package com.day11;

import java.util.Scanner;

class Account {
	protected String acNo;
	protected int balance;

	Account(String acNo, int balance){
		this.acNo = acNo;
		this.balance = balance;
	}

	public void deposit(int money){
		balance += money;
	}
	public void withdrawal(int money) {
		balance -= money;
	}
	public void display() {
		System.out.println("계좌번호:"+acNo); 
		System.out.println("계좌잔액:"+balance + "\n");
	}
}

class FaithAccount extends Account{
	private final static double FAITHRATE = 0.01;
	
	FaithAccount(String acNo, int balance){
		super(acNo, balance);
		int interest = (int)(balance * FAITHRATE);
		super.balance += interest;
	}
	
	public void deposit(int money) {
		balance += money + (int)(money * FAITHRATE);
	}
}

class ContriAccount extends Account{
	private static int totalContribution;
	private final static double CONTRIRATE = 0.01;
	
	ContriAccount(String acNo, int balance){
		super(acNo, balance);
		int contribution = (int)(balance * CONTRIRATE);
		totalContribution += contribution;
		super.balance -= contribution;
	}
	
	public void deposit(int money) {
		super.balance += money - (int)(money * CONTRIRATE);
		totalContribution += (int)(money * CONTRIRATE);
	}
	
	public void display() {
		super.display();
		System.out.println("총 기부액 : " + totalContribution);
	}
}

public class AccountTest {

	public static void deposit(Account a, int money) {
		a.deposit(money);
		a.display();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개설할 계좌의 종류-일반계좌<A>, 신용계좌<F>,기부계좌<C>를 입력후");
		System.out.println("계좌번호, 잔액을 입력하세요");
		
		String type = sc.nextLine();
		String acNo = sc.nextLine();
		int balance = sc.nextInt();
		Account a = new Account(null, 0);
		
		System.out.println("\n===========");
		if(type.equalsIgnoreCase("A")) {
			a = new Account(acNo, balance);
			a.display();
			
			System.out.println("입금할 금액을 입력하세요");
			int money = sc.nextInt();
			deposit(a, money);
		} else if(type.equalsIgnoreCase("F")) {
			a = new FaithAccount(acNo, balance);
			a.display();
			
			System.out.println("입금할 금액을 입력하세요");
			int money = sc.nextInt();
			deposit(a, money);
		} else if(type.equalsIgnoreCase("C")) {
			a = new ContriAccount(acNo, balance);
			a.display();
			
			System.out.println("입금할 금액을 입력하세요");
			int money = sc.nextInt();
			deposit(a, money);
			
		}
		
	}

}
