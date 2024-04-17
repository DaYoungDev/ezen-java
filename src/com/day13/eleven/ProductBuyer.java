package com.day13.eleven;

// 고객 - 구매자
public class ProductBuyer {
	private int myMoney;
	private int myPoint;
	
	private static final int MAX_COUNT = 10;

	// 구해한 상품을 저장할 배열
	private Product[] pdArr = new Product[MAX_COUNT];
	private int idx;
	
	public ProductBuyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	// 상품을 구매하는 메소드
	public void buy(Product p) {
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 구매불가");
		}
		
		// 잔고는 줄고, 포인트는 늘어난다
		this.myMoney -= p.getPrice();
		this.myPoint += p.getBonusPoint();
		
		// 배열에 넣어주기
		pdArr[idx++] = p;
		
		System.out.println(p.findInfo() + "를 구매하였습니다.");
	}
	
	// 배열의 정보를 꺼내는 메소드
	public void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i = 0; i < idx; i++) {
			Product p = pdArr[i];
			sum += p.getPrice();
			itemList += p.findInfo();
			if(i < idx - 1) {
				itemList += ", ";
			}
		}
		
		System.out.println("\n구입하신 상품의 총 금액 : " + sum);
		System.out.println("구입하신 상품 목록 : " + itemList + "\n");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("포인트점수 : " + myPoint + "\n");
	}
}
