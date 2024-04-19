package com.day15;

import java.util.ArrayList;

// 고객 - 구매자
public class ProductBuyer {
	private int myMoney;
	private int myPoint;
	

	// 구해한 상품을 저장할 배열
	private ArrayList<Product> pdList = new ArrayList<>(10) ;
	
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
		pdList.add(p);
		
		System.out.println(p + "를 구매하였습니다.");
	}
	
	// 배열의 정보를 꺼내는 메소드
	public void summary() {
		if(pdList.isEmpty()) {
			System.out.println("구매한 상품이 없습니다.");
			return;
		}
		
		int sum = 0;
		String itemList ="";
		
		for(int i = 0; i < pdList.size(); i++) {
			Product p = pdList.get(i);
			sum += p.getPrice();
			itemList += (i == 0)? "" + p : ", " + p;
			
		}
		
		System.out.println("\n구입하신 상품의 총 금액 : " + sum);
		System.out.println("구입하신 상품 목록 : " + itemList + "\n");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("포인트점수 : " + myPoint + "\n");
	}
	
	public void refund(Product p) { // 구매한 상품 환불
		// boolean remove(Object o)
		if(pdList.remove(p)) {
			myMoney += p.getPrice();
			myPoint -= p.getBonusPoint();
			System.out.println(p + "를 반품하셨습니다.");
		} else { // 제거에 실패한 경우
			System.out.println("구매한 상품 중 해당 상품은 없습니다.");
		}
		
	}
}
