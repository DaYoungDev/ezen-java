package com.day13.eleven;

public class Card {
	private final int KIND; // 카드 무늬 1~4
	private final int NUMBER; // 무늬별 카드 숫자 1~10 JQK
	
	private static final int SPADE = 1;
	private static final int DIAMOND = 2;
	private static final int HEART = 3;
	private static final int CLOVER = 4;
	
	public static final int MAX_KIND = 4;
	public static final int MAX_NUMBER = 13;
	
	public Card(){ // 같은 클래스의 다른 생성자 호출
		this(SPADE, 1);
	}
	
	public Card(int kind, int num) {
		this.KIND = kind; // final상수 - 생성자에서 단한번 초기화
		// 객체별로 다른 값을 줄 수 있다.
		this.NUMBER = num;
	}
	
	public String findInfo() {
		String kind = "", num = "";
		kind = switch(KIND) {
			case SPADE -> "SPADE";
			case DIAMOND -> "DIAMOND";
			case HEART -> "HEART";
			case CLOVER -> "CLOVER";
			default -> "";
		};
		num = switch(NUMBER) {
			case 11 -> "J";
			case 12 -> "Q";
			case 13 -> "K";
			default -> NUMBER + "";
		};
		return "card[kind : " + kind + ", number : " + num + "]";
	}
}
