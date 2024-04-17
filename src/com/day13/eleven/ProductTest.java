package com.day13.eleven;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		ProductBuyer b = new ProductBuyer(1000);
		
//		// 1. tv 구매, 가격 : 100
//		Product tv = new TV(100);
//		b.buy(tv);
//		b.showInfo();
//		
//		// 2. Computer 구매, 가격 : 200
//		Product com = new Computer(200);
//		b.buy(com);
//		b.showInfo();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.상품구매 2.구매내역 조회 3.종료");
			int type = sc.nextInt();
			if(type == 1) {
				System.out.println("구매할 상품을 선택하세요(1.TV 2.Computer)");
				int choice = sc.nextInt();
				Product p = null;
				if(choice == 1) {
					System.out.println("상품가격을 입력하세요");
					int cost = sc.nextInt();
					p = new TV(cost);
				} else if(choice == 2) {
					System.out.println("상품가격을 입력하세요");
					int cost = sc.nextInt();
					p = new Computer(cost);
				}
				b.buy(p);
				b.showInfo();
			} else if(type == 2) {
				b.summary();
			} else if(type == 3) {
				break;
			}
		}
	}

}
