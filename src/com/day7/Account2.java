package com.day7;

// 은행계좌 클래스
public class Account2 {
	
	// 1. 멤버변수
	String accId; // 계좌번호
	String name; // 이름
	int balance; // 잔액
	
	// 2. 생성자(constructor)
	public Account2(String p_accId, String p_name, int p_balance) {
		accId = p_accId;
		name = p_name;
		balance = p_balance;
	}
	
	/*
	 생성자
	 - 멤버변수의 초기화를 목적으로 정의된 메소드
	 - 객체가 생성될 대 자동 호출되어 가장 먼저 실행되는 메소드
	 - 클래스 이름과 동일함, 매개변수는 가질 수 있으나 반환값은 가질 수 없다
	 
	 - 기본생성자는 컴파일러에 의해 자동으로 만들어짐
	 	그러나 다른 생성자가 있으면 컴파일러에 의해 기본생성자가 만들어지지 않는다
	 	
	 */
	
	// 기본 생성자(매개변수가 없는 생성자)
	public Account2() {
		accId = null;
		name = null;
		balance = 0;
	}
	
	// 3. 메소드
	public void deposit(int money) { // 입금
		balance += money;
	}
	
	public void withdraw(int money) { // 출금
		balance -= money;
	}
	
	public void showBalance() { // 계좌정보 출력
		System.out.println("=====계좌정보 출력=====");
		System.out.println("계좌번호 : " + accId);
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance + "\n");
	}

}
