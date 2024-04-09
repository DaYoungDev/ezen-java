package com.day8.six;

public class SaleFood {
	// 필드
	private String menu;
	private int count, cost, price;
	
	private static double salePercent = 0.15;
	private static int totalPrice;
	
	// 생성자
	public SaleFood(String menu, int count, int cost){
		this.menu = menu;
		this.count = count;
		this.cost = cost;
	}

	// getter / setter
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPrice() {
		return price;
	}	
	
	public static int getTotalPrice() {
		return totalPrice;
	}
	
	// method
	public int sellingPrice() {
		int discount = (int)(count * cost * salePercent);
		price = (count * cost) - discount;
		return price;
	}
	
	public void totalPrice() {
		totalPrice += price;
	}
}
