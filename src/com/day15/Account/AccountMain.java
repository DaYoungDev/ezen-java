package com.day15.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Account> arrList = new ArrayList<Account>();
		while(true) {
			System.out.println("======menu=====");
			System.out.println("1. 계좌개설\n2. 입금\n3. 출금\n4. 계좌정보 전체 출력\n5. 프로그램 종료");
			System.out.print("선택 : ");
			int type = sc.nextInt();

			if(type == 1) {
				System.out.println("[계좌종류선택]");
				System.out.println("1.보통예금계좌\n2.신용신뢰계좌");
				System.out.print("선택 : ");
				int choice = sc.nextInt();

				if(choice == 1) {
					System.out.println("[보통예금계좌 개설]");
					System.out.print("계좌ID : ");
					String accNo = sc.next().trim();
					System.out.print("이름 : ");
					String name = sc.next().trim();
					System.out.print("입금액 : ");
					int balance = sc.nextInt();
					System.out.print("이자율 : ");
					int rate = sc.nextInt();

					arrList.add(new NormalAccount(accNo, name, balance, rate));
				} else if(choice == 2) {
					System.out.println("[신용신뢰계좌 개설]");
					System.out.print("계좌ID : ");
					String accNo = sc.next().trim();
					System.out.print("이름 : ");
					String name = sc.next().trim();
					System.out.print("입금액 : ");
					int balance = sc.nextInt();
					System.out.print("이자율 : ");
					int rate = sc.nextInt();

					System.out.print("\n신용등급(1toA, 2toB, 3toC) : ");
					int countRate = sc.nextInt();

					arrList.add(new HighCreditAccount(accNo, name, balance, rate, countRate));
				}
			} else if(type == 2) {
				System.out.println("[입금]");
				System.out.print("계좌 ID : ");
				String accNo = sc.next().trim();
				System.out.print("입금액 : ");
				int money = sc.nextInt();

				for(Account a : arrList) {
					if(accNo.equals(a.getAccNo())) {
						a.deposit(money);
						System.out.println("입금완료");
						break;
					} else {
						System.out.println("유효하지 않은 ID 입니다.");
						break;
					}
				}
			}else if(type == 3) {
				System.out.println("[출금]");
				System.out.print("계좌 ID : ");
				String accNo = sc.next().trim();
				System.out.print("출금액 : ");
				int money = sc.nextInt();

				for(Account a : arrList) {
					if(accNo.equals(a.getAccNo())) {
						if(a.withdrawal(money) == 0) {
							System.out.println("잔액부족");
						} else {
							System.out.println("출금완료");
							break;
						}
					}else {
						System.out.println("유효하지 않은 ID 입니다.");
						break;
					}
				}
			}else if(type == 4) {
				for(Account aa : arrList) {
					aa.showInfo();
				}
			} else if(type ==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
