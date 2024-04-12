package com.day9;

import java.util.Scanner;

public class AccountArray2 {

	public static void main(String[] args) {
		Account[] accList = new Account[3];
		Scanner sc = new Scanner(System.in);
		
		// 1. 계좌 3개의 정보를 입력받아서 배열에 넣고
		for(int i = 0; i < accList.length; i++) {
			System.out.println("계좌번호, 잔액, 출금액을 입력하세요");
			String accId = sc.next();
			int balance = sc.nextInt();
			int money = sc.nextInt();
			
			accList[i] = new Account(accId, balance);

			// 출금 메소드 호출
			accList[i].withdraw(money);
		}
		// 2. 배열에 들어있는 계좌 전체의 정보를 출력한다
		System.out.println("\n=====전체 계좌 정보 ======");
		for(int i = 0; i < accList.length; i++){
			accList[i].display();
		}
	}

}
