package com.day12;

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
	abstract double calcArea();  // 도형의  면적을  계산해서  반환하는  메서드 
}
class Point { 
	private int x; 
	private int y; 
	Point() {
		this(0,0); 
	}
	Point(int x, int y) { 
		this.x = x; 
		this.y = y;
	}
	public String findInfo() { 
		return "[" + x + "," + y + "]";
	}
}

class Circle2 extends Shape {
	private double r;

	Circle2(double r) {
		this.r=r;
	}
	Circle2(Point p, double r){
		super(p);
		this.r = r;
	}

	public double calcArea() {
		return r * r * 3.14;
	}
}

class Rect2 extends Shape{
	private int width;
	private int height;

	Rect2(int width,int height) {
		this.height=height;
		this.width=width;
	}
	Rect2(Point p, int width, int height){
		super(p);
		this.width = width;
		this.height = height;
	}

	public double calcArea() {
		return width * height;
	}

	public boolean isSquare() {
		if(width != height) {
			return false;
		}
		return true;
	}
}
public class ShapeTest {
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		Shape[] arr = {new Circle2(5.2), new Rect2(3, 4), new Circle2(1)}; 
		System.out.println("면적의 합 : "+sumArea(arr));


		Scanner sc = new Scanner(System.in);
		Shape[] shArr=new Shape[3];

		int idx=0;
		while (true) {
			System.out.println("1. 원 2. 사각형 3. 종료(종료시 각각 계산된 면적조회) 선택");
			int input=sc.nextInt();
			if (input == 1) {
				System.out.println("반지름, x, y를 입력하세요");
				double r = sc.nextDouble();
				int x = sc.nextInt();
				int y = sc.nextInt();
				shArr[idx] = new Circle2(new Point(x,y),r);
				idx++;
			} else if(input == 2) {
				System.out.println("가로, 세로, x, y를 입력하세요");
				int w = sc.nextInt();
				int h = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				shArr[idx] = new Rect2(new Point(x,y),w,h);
				idx++;
			} else if (input==3) {
				break;
			}
		}
		
		for (int i=0;i<idx;i++) {
			System.out.println("면적 : "+shArr[i].calcArea());
			System.out.println("[x좌표,y좌표]="+shArr[i].getP().findInfo());
		}
	}

}
