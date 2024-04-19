package com.hw.day12;

import java.util.Scanner;

abstract class Shape {
	private Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	Point getP() {
		return p;
	}
	
	void setP(Point p) {
		this.p = p;
	}

	abstract double calcArea();  // 도형의 면적을 계산해서 반환하는 메서드
}

class Point {
	private int x;
	private int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String findInfo() {
		return "["+x+","+y+"]";
	}
}


class Rect extends Shape {
	private double width;
	private double height;

	Rect(double width, double height) {
		this(new Point(0,0), width, height);
	}

	Rect(Point p, double width, double height) {
		super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
		this.width = width;
		this.height = height;
	}

	boolean isSquare() {
		// width나 height가 0이 아니고 width와 height가 같으면 true를 반환한다.
		return width*height!=0 && width==height;
	}

	double calcArea() {
		return width * height;
	}
}

class Circle extends Shape {
	private double r; // 반지름

	Circle(double r) {
		this(new Point(0,0),r); // Circle(Point p, double r)를 호출
	}

	Circle(Point p, double r) {
		super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
		this.r = r;
	}

	double calcArea() {
		return Math.PI * r * r;
	}
}

class ShapeHw2{
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i=0; i < arr.length;i++)
			sum+= arr[i].calcArea();

		return sum;
	}

	public static void main(String[] args){
		Shape[] arr = {new Circle(5.2), new Rect(3, 4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
		
		//
		Scanner sc=new Scanner(System.in);
		final int MAX_COUNT=100;
		Shape[] shArr=new Shape[MAX_COUNT];
		int idx=0;
		while (true) {
			System.out.println("\n1. 원 2. 사각형 3.조회 4. 종료 선택");
			int type=sc.nextInt();
			switch (type) {
				case 1->{
					System.out.println("반지름, x, y를 입력하세요");
					double r=sc.nextDouble();
					int x=sc.nextInt();
					int y=sc.nextInt();
					shArr[idx++]=new Circle(new Point(x,y),r);
				} 
				case 2-> {
					System.out.println("가로, 세로, x, y를 입력하세요");
					int w=sc.nextInt();
					int h=sc.nextInt();
					int x=sc.nextInt();
					int y=sc.nextInt();
					shArr[idx++]=new Rect(new Point(x,y),w,h);
				} 
				case 3 -> {
					for (int i=0;i<idx;i++) {
						System.out.println("면적 : "+shArr[i].calcArea());
						System.out.println("[x, y] = "+shArr[i].getP().findInfo());
					}
				}
				case 4 -> {
					System.out.println("종료합니다.");			
					return;
				}
				default ->{
					System.out.println("잘못 입력!");
					continue;
				}
			}//switch
		}//while
		
		
	}
}
