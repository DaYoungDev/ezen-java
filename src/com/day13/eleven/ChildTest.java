package com.day13.eleven;

public class ChildTest {

	public static void main(String[] args) {
		Child c1 = new Child(15);
		Child c2 = new Child(9);
		System.out.println("게임 전 구슬의 보유개수");
		System.out.println("====어린이 1====");
		c1.showProperty();
		System.out.println("====어린이 2====");
		c2.showProperty();
		
		// 게임 1
		c1.obtainBead(c2, 2);
		
		// 게임 2
		c2.obtainBead(c1, 7);
		
		System.out.println("\n게임 후 구슬의 보유개수");
		System.out.println("====어린이 1====");
		c1.showProperty();
		System.out.println("====어린이 2====");
		c2.showProperty();
	}

}
