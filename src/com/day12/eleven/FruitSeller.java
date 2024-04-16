package com.day12.eleven;

// 과일 판매자 클래스(과일장사)
public class FruitSeller {
	private int numOfApple; // 사과 갯수
	private int myMoney; // 판매수익(남은 돈)
	private final int APPLE_PRICE; // 사과 하나의 가격
	
	// 생성자
	public FruitSeller(int numOfApple, int myMoney, int APPLE_PRICE){
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		this.APPLE_PRICE = APPLE_PRICE; // final 상수 : 생성자에서 단한번 초기화
		// => 인스턴스별로 다른 값 할당
	}
	
	// 사과 판매 메소드
	public Rest saleApple(int money) {
		Rest r = null;
		
		if(money % APPLE_PRICE == 0) {
			int num = money / APPLE_PRICE;
			numOfApple -= num; // 사과갯수 줄고
			myMoney += money; // 돈은 늘어나고
			r = new Rest(num, money,0);
		} else {
			int num = money / APPLE_PRICE;
			numOfApple -= num; // 사과갯수 줄고
			myMoney += money; // 돈은 늘어나고
			int rest = money % APPLE_PRICE;
			r = new Rest(num, money, rest);
		}
		
		return r; // 구매자에게 줄 거래 정보
	}
	
	public void showResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매수익 : " + myMoney + "\n");
	}
	
}
