package com.day7;

public class AccountTest2 {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		acc.showBalance();
		
		// 생성자에 의해 멤버변수 초기화
		Account2 acc2 = new Account2("101-3000-003", "김길동", 200000);
		acc2.showBalance();
		// new 오른쪽 부분이 생성자 호출하는 부분
		acc2.showBalance();
		
		// 멤버변수의 값변경하기
		acc2.name = "이길수";
		acc2.balance = 300000;
		acc2.showBalance();
		
	}

}
