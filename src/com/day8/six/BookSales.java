package com.day8.six;

public class BookSales {
	// 1. 필드
	// 인스턴스 변수
	private String title;
	private int quantity, price, salesPrice;
	
	// static 변수
	private static int totalSalesPrice; // 총 판매금액
	
	// 2. 생성자
	public BookSales(String title, int quantity, int price) {
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	// 3. getter / setter
	public int getSalesPrice() {
		return salesPrice;
	}
	public static int getTotalSalesPrice() {
		return totalSalesPrice;
	}
	
	// 4. 메소드
	public void findSalesPrice() {
		salesPrice = price * quantity;
	}
	
	public void findTotal() {
		totalSalesPrice += salesPrice;
	}
	

}
