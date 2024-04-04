package com.day4;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 무한루프
		 while(true){
		 	반복내용
		 	
		 	if(조건){
		 		break;
		 	}
		 }
		 */
		
		// 사용자로부터 입력받은 수의 합을 구하되, 0이 입력되면 실행을 중지
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("숫자입력!(끝낼때는 0)");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			
			sum += num;
		}
		
		System.out.println("총합 : " + sum);
	}

}
