package com.day8.six;

import java.util.Scanner;

public class SaleFoodTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴, 수량, 단가를 입력하세요!");
			String menu = sc.nextLine();
			int count = sc.nextInt();
			int cost = sc.nextInt();
			
			SaleFood f1 = new SaleFood(menu, count, cost);
			int sell = f1.sellingPrice();
			f1.totalPrice();
			
			System.out.println("판매금액 : " + sell);
			System.out.println("누적판매금액 : " + f1.getTotalPrice());
			
			System.out.println("그만하려면 Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}
	}

}
