package com.day10;

/*
 [1] final 변수
  - 상수지만 선언과 함께 초기화하지 않고
    생성자에서 단 한번만 초기화할 수 있다.
  - 각 인스턴스마다 다른 값을 갖도록 할 수 있다.
 [2] static final 변수
  - 선언과 함께 초기화
  - 클래스 차원에서 하나만 생성, 모든 객체가 공유한다
 */

class Card{
	final String KIND; // 카드종류
	final int NUMBER; // 카드 숫자
	
	static final int WIDTH = 100;
	static final int HEIGHt = 250;
	
	// 생성자
	Card(String kind, int number){
		KIND = kind; // 생성자에서 final변수값 초기화
		NUMBER = number;
	}
	
	public void showInfo() {
		// NUMBER = 10; // error : The final field Card.NUMBER cannot be assigned
		System.out.println("카드종류 : " + KIND);
		System.out.println("카드숫자 : " + NUMBER + "\n");
	}
}
public class CardTest {
	public static void main(String[] args) {
		Card c = new Card("Heart", 7);
		c.showInfo();
		
		Card c2 = new Card("Diamond", 3);
		c2.showInfo();
		
		
	}

}
