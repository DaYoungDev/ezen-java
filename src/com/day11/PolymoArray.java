package com.day11;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}
	public String getType() {
		return " ";
	}
}

class Circle2 extends Shape2{
	//멤버변수
	private int radius; 
	
	//생성자
	Circle2(int radius) {
		this.radius=radius;
	}
	
	//메소드
	public double findArea() { //넓이 구하는 메소드
		double area = radius*radius*3.14;
		return area;
	}
	
	public String getType() {
		return "원";
	}
}

class Rectangle2 extends Shape2{
	private int width;
	private int height;
	
	Rectangle2(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public double findArea() {
		double area = width * height;
		return area;
	}
	
	public String getType() {
		return "사각형";
	}
}

public class PolymoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX_COUNT = 2;
		Shape2[] sArr = new Shape2[MAX_COUNT];
		int idx = 0;
		
		while(true) {
			System.out.println("1.원 2.사각형 3.보기 4.종료");
			int type = sc.nextInt();

			if((type == 1 || type == 2) && idx == MAX_COUNT) {
				System.out.println("더이상 입력할 수 없습니다.");
				continue;
			}
			
			switch(type) {
				case 1 -> {
					System.out.println("반지름 입력");
					int r = sc.nextInt();
					sArr[idx++] = new Circle2(r);
				}
				case 2 -> {
					System.out.println("가로, 세로 입력");
					int w = sc.nextInt();
					int h = sc.nextInt();
					sArr[idx++] = new Rectangle2(w, h);
				}
				case 3 -> {
					if(idx == 0) {
						System.out.println("\n조회할 데이터가 없습니다.");
						break;
					}
					System.out.println("\n=======보기======");
					for(int i = 0; i < idx; i++) {
						double area = sArr[i].findArea();
						System.out.println(sArr[i].getType() + "의 면적 : " + area);
					}
					System.out.println("================\n");
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
