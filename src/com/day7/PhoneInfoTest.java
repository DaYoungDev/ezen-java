package com.day7;

import java.util.Scanner;

public class PhoneInfoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "홍길동";
		String phone = "010-100-2000";
		String birth = "92-01-17";
		
		PhoneInfo p1 = new PhoneInfo(name, phone, birth);
		p1.showInfo();
		System.out.println();
		
		name = "김연아";
		phone = "010-300-4000";
		PhoneInfo p2 = new PhoneInfo(name, phone);
		p2.showInfo();
		System.out.println();
		
		// 무한루프로 입력받기
		while(true) {
			System.out.println("선택하세요..");
			System.out.println("1. 데이터입력 \n2. 프로그램종료");
			int check = sc.nextInt();
			if(check == 1) {
				System.out.println("선택 : " + check);
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("전화번호 : ");
				phone = sc.next();
				System.out.print("생년월일 : ");
				birth = sc.next();
				
				PhoneInfo p3 = new PhoneInfo(name, phone, birth);
				
				System.out.println("\n=======입력된 정보 출력======");
				p3.showInfo();
			} else if(check == 2) {
				System.out.println("선택 : " + check);
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
