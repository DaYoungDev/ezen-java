package com.day4;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 무한루프
		 for(;;){
		 	반복할 내용
		 	
		 	if(조건){
		 		break;
		 	}
		 }
		 
		 break - 반복문 탈출
		 무한루프에는 반드시 break가 있어야함 
		 */
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("정수 입력하세요");
			int num = sc.nextInt();
			
			String result = "";
			if(num > 0) {
				result = "양수";
			} else if(num < 0) {
				result = "음수";
			} else {
				result = "0";
			}
			System.out.println(result);
			
			System.out.println("계속 하시겠습니까? (Y/N)");
			String quit = sc.next();
			if(quit.equalsIgnoreCase("N")) {
				break;
			}
		}
		
	}

}
