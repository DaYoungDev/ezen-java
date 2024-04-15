package com.day11;

import java.util.Scanner;

public class ShapeManager {
	
	Scanner sc = new Scanner(System.in);
	final int MAX_COUNT = 2;
	Shape2[] sArr = new Shape2[MAX_COUNT];
	int idx = 0;
	
	public void inputCircle() {
		if(idx == MAX_COUNT) {
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("반지름 입력");
		int r = sc.nextInt();
		sArr[idx++] = new Circle2(r);
	}
	
	public void inputRect() {
		if(idx == MAX_COUNT) {
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("가로, 세로 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		sArr[idx++] = new Rectangle2(w, h);
	}
	
	public void showData() {
		if(idx == 0) {
			System.out.println("\n조회할 데이터가 없습니다.");
			return;
		}
		System.out.println("\n=======보기======");
		for(int i = 0; i < idx; i++) {
			double area = sArr[i].findArea();
			System.out.println(sArr[i].getType() + "의 면적 : " + area);
		}
		System.out.println("================\n");
	}
	
	
}
