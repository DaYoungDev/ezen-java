package com.day10;

import java.util.Scanner;

class Account{
	protected String accNo;
	protected int balance;
	
	Account(String accNo, int balance){
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("계좌번호 : " + accNo);
		System.out.println("계좌잔액 : " + balance);
	}
}

class KBAccount extends Account{
	private int limit;
	
	KBAccount(String accNo, int balance, int limit){
		super(accNo, balance);
		this.limit = limit;
	}
	
	public void display() {
		super.display();
		System.out.println("이체한도 : " + limit + "\n");
	}
}

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호, 잔액, 이체한도를 입력하세요");
		String accNo = sc.nextLine();
		int balance = sc.nextInt();
		int limit = sc.nextInt();
		
		KBAccount kb = new KBAccount(accNo, balance, limit);
		kb.display();
		
		// KBAccount 배열
		KBAccount[] accList = new KBAccount[3];
		for(int i = 0; i < accList.length; i++) {
			System.out.println("계좌번호, 잔액, 이체한도를 입력하세요");
			sc.nextLine();
			accNo = sc.nextLine();
			balance = sc.nextInt();
			limit = sc.nextInt();
			
			KBAccount kb1 = new KBAccount(accNo, balance, limit);
			accList[i] = kb1;
		}
		
		// 전 계좌정보 출력
		for(KBAccount c : accList) {
			c.display();
		}
	}

}
