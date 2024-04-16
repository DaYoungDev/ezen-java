package com.day12.eleven;

class Rest{
	private int num;
	private int money;
	private int rest;
	
	Rest(int num, int money, int rest){
		this.num = num;
		this.money = money;
		this.rest = rest;
	}

	public int getNum() {
		return num;
	}
	public int getMoney() {
		return money;
	}
	public int getRest() {
		return rest;
	}

}

public class FruitTest {

	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(30, 0, 1500);
		FruitSeller seller2 = new FruitSeller(20, 0, 1000);
		
		FruitBuyer buyer = new FruitBuyer(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("판매자 1의 현재 상황");
		seller1.showResult();
		
		System.out.println("판매자 2의 현재 상황");
		seller2.showResult();
		
		buyer.showResult();
		
		// 
		buyer.buyApple(seller1, 2000);
		
		buyer.buyApple(seller2, 5000);
		
	}

}
