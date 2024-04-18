package com.day14.thirteen;

public class Product {
	private String code;
	private String pdName;
	private int price;
	
	public Product(String code, String pdName, int price) {
		this.code = code;
		this.pdName = pdName;
		this.price = price;
	}
	
	// 오버라이딩
	public String toString() {
		return "code : " + code + ", pdName : " + pdName + ", price" + price;
	}
}
