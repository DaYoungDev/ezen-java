package com.day15;

public class ProductMain {

	public static void main(String[] args) {
		ProductBuyer buyer = new ProductBuyer(1000);
		
		// 300만원 TV 구매
		Product tv1 = new TV(300);
		buyer.buy(tv1);
		
		// 100만원 Computer 구매
		Product com = new Computer(100); 
		buyer.buy(com);
		
		// 200만원 TV 구매
		Product tv2 = new TV(200);
		buyer.buy(tv2);
		
		// summary
		buyer.summary();
		
		// 300만원 TV 반품
		buyer.refund(tv1);
		
		// summary
		buyer.summary();
	}

}
