package com.day7;

public class AccountTest {

	public static void main(String[] args) {
		/*
		 클래스를 작성한 다음 클래스로부터 객체를 생성하여 사용한다.
		 객체를 사용한다는 것 - 객체가 가지고 있는 속성과 기능을 사용한다는 뜻
		 */
		// 1. 객체 생성 - 해당 클래스의 멤버변수와 메소드를 메모리에 할당
		Account acc;
		acc = new Account();
		
		/*
		 # 객체 생성 방법
		 클래스이름 변수명 = new 클래스이름();
		 예) Account acc = new Account();
		 
		 acc => 참조변수
		 
		 비교)
		 int a; // 변수선언
		 int[] arr = new int[3]; // 배열선언, 메모리할당
		 Scanner sc = new Scanner(System.in); // Scanner 객체생성
		 */
		
		// 2. 메소드 사용
		acc.showBalance(); // 멤버변수는 자동으로 디폴트값으로 초기화됨
		
		// 두번째 객체(또 다른 객체) 생성
		Account acc2 = new Account();
		
		// 멤버변수 사용 - 값 할당
		acc.accId = "100-2000-001";
		acc.name = "홍길동";
		acc.balance = 100000;
		
		// 메소드 사용
		acc.withdraw(30000); // 3만원 출금
		acc.showBalance();
		
		acc.deposit(50000); // 5만원 입금
		System.out.println("현재 잔액 : " + acc.balance);
		// 멤버변수 사용(참조)
		
	}

}
