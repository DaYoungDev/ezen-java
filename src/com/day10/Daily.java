package com.day10;

import java.util.Scanner;

class Rect {
	private int width;
	private int height;

	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}
}

public class Daily {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect[] arr = new Rect[4];

		for(int i = 0; i < arr.length; i++) {
			System.out.println("사각형의 가로와 세로를 입력하세요");
			int width = sc.nextInt();
			int height = sc.nextInt();
			Rect r = new Rect(width, height);

			arr[i] = r;
		}
		for(int i = 0; i < arr.length; i++) {
			int area = arr[i].findArea();
			System.out.println("사각형의 넓이 : " + area);
		}


		Rect[] arr2 = new Rect[100];
		int index = 0;
		while(index < 100) {
			System.out.println("입력하세요 1.저장 2.전체조회 3.종료");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("사각형의 가로와 세로를 입력하세요");
				int width = sc.nextInt();
				int height = sc.nextInt();
				Rect r = new Rect(width, height);

				arr[index] = r;
				index++;
			} else if(choice == 2) {
				for(int i = 0; i < index; i++) {
					int area = arr[i].findArea();
					System.out.println("사각형의 넓이 : " + area);
				}
			} else if(choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하였습니다.");
			}
		}
	}
}
