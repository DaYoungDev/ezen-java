package com.day12;

import java.util.Scanner;

interface IShape{
	public void draw();
	public void delete();
}

class Circle implements IShape{
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	public void delete() {
		System.out.println("원을 지웁니다");
	}
}

class Rect implements IShape{
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
	public void delete() {
		System.out.println("사각형을 지웁니다");
	}
}


public class InterfaceExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요(1.원 2.사각형)");
		int type = sc.nextInt();
		if(type == 1) {
			IShape i = new Circle();
			i.draw();
			i.delete();
		} else if(type == 2) {
			IShape i = new Rect();
			i.draw();
			i.delete();
		}
		
	}

}
