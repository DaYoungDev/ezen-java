package com.day7;

/*
 객체(Object)
 	- 물건, 대상
 객체 지향 프로그래밍
 	- 사물과 대상(객체)의 행동을 있는 그대로 실체화시키는 형태의 프로그래밍
 
 객체의 구성요소
 1) 상태정보(속성, 데이터) => 변수를 통해서 표현됨
 2) 행동(기능)		   => 메소드를 통해서 표현됨
 
 예) 은행계좌 개체
 상태정보 - 계좌번호, 이름, 잔액 => 변수로
 행동 - 출금한다, 입금한다 => 메소드로
 
 은행계좌객체는 여러개가 있을 수 있다
 여러개의 객체를 만들려면 객체를 찍어낼 수 있는 틀이 필요함
 그 틀이 클래스
 
 클래스		객체
 ---------------
 제품설계도	제품
 자동차설계도	자동차
 붕어빵틀		붕어빵
 과자틀		과자
 ----------------
 틀			실체
 
 클래스 - 똑같은 무엇인가를 계속해서 만들어 낼 수 있는 설계도면(틀)
 객체 - 클래스로 만든 피조물(실체)
 
 클래스 정의하기
 class 클래스 이름{
 	멤버변수(필드)
 	메소드
 }
 */

// 은행계좌 클래스
public class Account {
	
	// 1. 멤버변수
	String accId; // 계좌번호
	String name; // 이름
	int balance; // 잔액
	
	// 2. 메소드
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
