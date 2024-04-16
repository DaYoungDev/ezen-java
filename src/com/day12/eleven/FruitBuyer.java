package com.day12.eleven;

public class FruitBuyer {
	private int myMoney;
	private int numOfApple;
	
	public FruitBuyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	// 사과를 구매하는 메소드
	public void buyApple(FruitSeller seller, int money) {
		// 사과를 구매하는 데 있어서 필요한 것 : 구매대상, 구매금액
		if(myMoney - money < 0) {
			System.out.println("가지고 있는 금액으로는 구매를 할 수 없습니다.");
			return;
		}
		Rest r = seller.saleApple(money);
		numOfApple += r.getNum();
		myMoney -= money;
		int left = r.getRest();
		System.out.println("구매 후 잔액은 " + left);
	}
	
	public void showResult() {
		System.out.println("\n========구매자정보========");
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과갯수 : " + numOfApple + "\n");
	}
}
