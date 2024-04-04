package com.day4;

public class ForTest3 {

	public static void main(String[] args) {
		// for문의 중첩
		for(int i = 0; i < 3; i++) {
			System.out.println("========현재 i : " + i);
			for(int j = 0; j < 2; j++) {
				System.out.println("현재 j : " + j);
			}
			System.out.println();
		}
		
		// 구구단
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		// 구구단 가로로 출력
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
		
	}

}
