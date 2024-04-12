package com.day9;

import java.util.ArrayList;

public class AccountArray {

	public static void main(String[] args) {
		// int 배열
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 30;
		
		// 클래스 배열 - Account 배열
		Account[] accList = new Account[3];
		
		// Account배열에는 Account를 넣는다(new로 객체 생성해서)
		// 1. 배열에 Account객체를 생성해서 넣는다
		accList[0] = new Account("100-001-2000", 50000);
		accList[1] = new Account("100-002-3000", 10000);
		
		Account acc = new Account("100-003-4000", 200000);
		accList[2] = acc;
		
		/*
		// 객체생성 -> 메소드 호출
		Account acc2 = new Account("500-001-7000", 300000);
		acc2.display();
		*/
		/*
		// 2. 배열에 들어 있는 객체의 메소드를 호출한다
		accList[0].display();
		accList[1].display();
		accList[2].display();
		*/
		
		for(int i = 0; i < accList.length; i++) {
			accList[i].display();
		}
	}
}
