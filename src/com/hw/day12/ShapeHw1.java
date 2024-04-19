package com.hw.day12;

import java.util.Scanner;

interface IShape{
	public abstract void draw();
	void delete();
}

class Circle2 implements IShape{
	public void draw() 	{
		System.out.println("원을 그립니다");
	}

	public void delete() {
		System.out.println("원을 지웁니다");
	}
}

class Rect2 implements IShape{
	public void draw()	{
		System.out.println("사각형을 그립니다");
	}
	
	public void delete() {
		System.out.println("사각형을 지웁니다");
	}
}

public class ShapeHw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요(1. 원, 2. 사각형)");
		int s = sc.nextInt();
		IShape sh = null;
		if (s == 1)	{
			sh =  new Circle2();
		}else if (s == 2){
			sh = new Rect2();
		}

		sh.draw();
		sh.delete();
		
		IShape[] arr = new IShape[3];
		arr[0]=new Circle2();
		arr[1]=new Rect2();
		arr[2]=new Circle2();
		
		System.out.println("\n======for=======");
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();
			arr[i].delete();
		}
		
		System.out.println("\n======확장 for=======");
		for(IShape sh2 : arr) {
			sh2.draw();
			sh2.delete();
		}
		
		
	}

}
