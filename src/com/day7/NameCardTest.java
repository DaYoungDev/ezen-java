package com.day7;

import java.util.Scanner;

public class NameCardTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 회사주소, 직급을 입력하세요");
		String name = sc.nextLine();
		String number = sc.nextLine();
		String address = sc.nextLine();
		String grade = sc.nextLine();
		
		NameCard card = new NameCard(name, number, address, grade);
				
		card.printCard();
	}

}
