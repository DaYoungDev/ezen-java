package com.day3;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// 취미 입력받아서 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("취미를 입력하세요 : 1.영화 2.축구 3.야구 4.등산");
		int hobby = sc.nextInt();
		
		switch(hobby) {
			case 1:
				System.out.println("영화를 선택하였습니다.");
				break;
			case 2:
				System.out.println("축구를 선택하였습니다.");
				break;
			case 3:
				System.out.println("야구를 선택하였습니다.");
				break;
			case 4:
				System.out.println("등산을 선택하였습니다.");
				break;
			default :
				System.out.println("잘못입력하였습니다.");
		}
		
		
		// 월을 입력받아 해당하는 사분기 출력
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println(month + "월은 1사분기 입니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println(month + "월은 2사분기 입니다.");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println(month + "월은 3사분기 입니다.");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println(month + "월은 4사분기 입니다.");
			break;
		default :
			System.out.println("잘못 선택했어요");
		}
	}

}
