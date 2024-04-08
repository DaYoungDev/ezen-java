package com.day7;

public class NameCard {

	// 필드
	String name;
	String number;
	String address;
	String grade;
	
	// 생성자
	NameCard(String pName, String pNumber, String pAddress, String pGrade){
		name = pName;
		number = pNumber;
		address = pAddress;
		grade = pGrade;
	}
	
	// 메소드
	// 명함 출력 메소드 정의
	public void printCard() {
		System.out.println("================");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
		System.out.println("회사주소 : " + address);
		System.out.println("직급 : " + grade);
	}
}
