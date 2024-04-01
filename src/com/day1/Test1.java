package com.day1;

public class Test1 {

	public static void main(String[] args) {
		
		// 1. 주소록
		String name = "임다영";
		int age = 28;
		String phoneNumber = "010-1234-5678";
		String address = "서울시 관악구";
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("전화번호 : " + phoneNumber + ", 주소 : " + address);
		System.out.println();
		
		// 2. 상품 재고 조절
		String product = "휴대폰";
		int count = 15;
		int cost = 260000;
		int sellCost = 350000;
		
		System.out.println("상품 : " + product + ", 수량 : " + count);
		System.out.println("원가 : " + cost + ", 판매가격 : " + sellCost);
	}

}
