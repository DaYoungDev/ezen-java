package com.day11;

import java.util.Scanner;

public class PolymoArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShapeManager manager = new ShapeManager();
		
		while(true) {
			System.out.println("1.원 2.사각형 3.보기 4.종료");
			int type = sc.nextInt();

			switch(type) {
				case 1 -> {
					manager.inputCircle();
				}
				case 2 -> {
					manager.inputRect();
				}
				case 3 -> {
					manager.showData();
				}
				case 4 -> {
					System.out.println("프로그램을 종료합니다.");
					return;
				}
				default -> {
					System.out.println("잘못입력\n");
					continue;
				}
			}
			
		}
		
	}

}
