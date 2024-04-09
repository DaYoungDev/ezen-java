package com.day8.six;

import java.util.Scanner;

public class BookSalesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("책제목, 수량, 단가 입력");
			String title = sc.nextLine();
			int qty = sc.nextInt();
			int price = sc.nextInt();
			BookSales bs = new BookSales(title, qty, price);
			bs.findSalesPrice();
			bs.findTotal();
			
			System.out.println("판매금액 : " + bs.getSalesPrice());
			System.out.println("누적판매금액 : " + bs.getTotalSalesPrice());
			
			System.out.println("그만하려면 Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}
	}

}
