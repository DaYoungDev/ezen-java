package com.day15;

public abstract class Product {
	private int price; // 상품의 가격
	private int bonusPoint; // 포인트 점수
	private static final double POINT_RATE = 0.02;
	// => 가격의 2%가 포인트점수

	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price * POINT_RATE);
	}

	public int getPrice() {
		return price;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	
}

class TV extends Product{
	TV(int price){
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	Computer(int price){
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}
