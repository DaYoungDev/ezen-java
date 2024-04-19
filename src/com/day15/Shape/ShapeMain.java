package com.day15.Shape;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape> arr = new ArrayList<Shape>();
		Shape s = null;
		while(true) {
			System.out.print("1.원 2.사각형 3.보기 4.종료 ==> ");
			int type = sc.nextInt();

			if(type == 1) {
				System.out.print("반지름은? ");
				int radius = sc.nextInt();

				s = new Circle(radius);
				arr.add(s);
			} else if(type == 2) {
				System.out.print("가로는?");
				int width = sc.nextInt();
				System.out.print("세로는?");
				int length = sc.nextInt();

				s = new Rect(width, length);
				arr.add(s);
			} else if(type == 3) {
				if(arr.size() == 0) {
					System.out.println("입력된 도형이 없습니다.");
				}
				for(Shape ss : arr) {
					if(ss instanceof Circle) {
						Circle c = (Circle)ss;
						System.out.println("[Circle, r = " + c.getRadius() + "]");
						System.out.println(c + "의 둘레 : " + c.findGirth());
					} else if(ss instanceof Rect) {
						Rect r = (Rect)ss;
						System.out.println("[Rect, w =" + r.getWidth() + ", h = " + r.getLength() + "]");
						System.out.println(r + "의 둘레 : " + r.findGirth());
					}
				}

			} else if(type == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하였습니다.");
			}
		}
	}

}
