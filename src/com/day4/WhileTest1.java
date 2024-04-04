package com.day4;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		/*
		 while문
		 - 반복횟수가 가변적인 처리에 적합
		 
		 while(조건){
		 	반복명령;
		 }
		 => 조건을 만족하는 동안 반복명력을 반복수행함
		*/
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n=====while문 이용=====");
		int k = 0;
		while(k < 3) {
			System.out.println(k);
			k++; // 증감식
		}
		
		Scanner sc = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		String str = "";
		
		// boolean hasNext()
		// Returns true if this scanner has another token in its input.This method may block while waiting for input to scan.The scanner does not advance past any input.

		while(sc.hasNext()) {
			str = sc.nextLine();
			System.out.println("출력 : " + str);
		}
		
		str = sc.nextLine();
		System.out.println("while 탈출 후 1" + str);
		//str = sc.nextLine(); // error
		//System.out.println("while 탈출 후 2" + str);
		
	}

}
