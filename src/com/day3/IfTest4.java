package com.day3;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		// 중첩 if
		/*
		if문이 중복으로 사용된 것
		바깥쪽 if 문이 참이 되어야 안쪽 if문을 수행함

			if(조건식1){
				if(조건식2){
				 명령문1;
				} else {
				 명령문2;
				}
			}
		 */
		
		// 회원여부에 따라 처리, 회원인 경우에만 사은품 증정처리
		Scanner sc = new Scanner(System.in);
		System.out.println("회원여부를 입력하세요(1. 회원, 2. 비회원)");
		int flag = sc.nextInt();
		String gift = ""; // 사은품
		
		if(flag == 1) { // 바깥 if
			System.out.println("구매한 금액을 입력하세요.");
			int purchase = sc.nextInt();
			if(purchase >= 1000000) {
				gift = "외장하드";
			} else if(purchase >= 500000) {
				gift = "스피커";
			} else if(purchase >= 100000) {
				gift = "마우스";
			} else {
				gift = "10만원 미만은 사은품이 없습니다.";
			}
			System.out.println("구매금액별 사은품 : " + gift);
		} else {
			gift ="비회원은 사은품 증정 불가";
			System.out.println(gift);
		}
		
	}

}
