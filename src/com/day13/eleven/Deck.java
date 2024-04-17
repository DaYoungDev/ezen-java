package com.day13.eleven;

public class Deck {
	private static final int CARD_NUM = 52;

	// 포함관계 - Card 클래스를 배열로 포함시킴
	// 카드 52장 배열
	private Card[] cardArr = new Card[CARD_NUM];
	private int idx;

	public Deck() {
		// 카드 52장 초기화 4*13
		for(int i = 1; i <= Card.MAX_KIND; i++) { // 카드종류 4
			for(int j = 1; j <= Card.MAX_NUMBER; j++){ // 카드숫자 13
				Card c = new Card(i, j);
				cardArr[idx++] = c;
			}
		}
	}

	public Card[] getCardList() {
		return cardArr;
	}
	public void setCardArr(Card[] cardArr) {
		this.cardArr = cardArr;
	}

	// 임의의 카드 한 장 뽑기
	public Card pick() {
		// 0~51 사이의 idx에 해당하는 랜덤값뽑기
		int rnd = (int)(Math.random() * 52);
		return cardArr[rnd];
	}

	// 지정된 위치에 있는 카드 하나 뽑기
	public Card pick(int idx) {
		Card c = null;
		if(idx < 0 || idx >= CARD_NUM){
			c = pick();
		} else{
			c = cardArr[idx];
		} 
		return c;
	}
	
	// 카드의 순서를 섞어주는 메소드
	public void shuffle() {
		for(int i = 0; i < 1000; i++) {
			// 랜덤한 index값 구하기
			int rnd = (int)(Math.random() * 52); // 0~51
			
			// 0번째 배열의 값과 랜덤번째 배열의 값을 서로 맞바꾼다 swap
			Card t = cardArr[0];
			cardArr[0] = cardArr[rnd];
			cardArr[rnd] = t;
		}
	}
}
