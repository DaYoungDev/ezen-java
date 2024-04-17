package com.day13.eleven;

public class FruitTest {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(12000);

		FruitSeller seller1 = new FruitSeller(0, 30, 1500);
		FruitSeller seller2 = new FruitSeller(0, 20, 2000);

		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);

		System.out.println("판매자1의 현재상황");
		seller1.showResult();

		System.out.println("판매자2의 현재상황");
		seller2.showResult();

		buyer.showResult();

		//
		buyer.buyApple(seller2, 6000);
		buyer.buyApple(seller1, 4000);

		System.out.println("\n=====================");
		System.out.println("판매자1의 현재상황");
		seller1.showResult();

		System.out.println("판매자2의 현재상황");
		seller2.showResult();

		buyer.showResult();
	}

}
