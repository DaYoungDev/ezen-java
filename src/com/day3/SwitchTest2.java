package com.day3;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별입력 (M/F)");
		String gender = sc.nextLine();
		
		String result = "";
		switch(gender) {
			case "M" :
				result = "남";
				break;
			case "F" :
				result = "여";
				break;
			default :
				result = "잘못 입력!";
		}
		System.out.println(result);
		
		// 소문자 or 처리
		switch(gender) {
			case "M" :
			case "m" :
				result = "남";
				break;
			case "F" :
			case "f" :
				result = "여";
				break;
			default :
				result = "잘못 입력!";
		}
		System.out.println(result);
		
		// method 사용해서 대문자로 전환
		switch(gender.toUpperCase()) {
			case "M" :
				result = "남";
				break;
			case "F" :
				result = "여";
				break;
			default :
				result = "잘못 입력!";
		}
		System.out.println(result);
	}

}
