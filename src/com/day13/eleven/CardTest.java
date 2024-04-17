package com.day13.eleven;

public class CardTest {

	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한벌 만들기
		
		// 카드 한벌 출력 - for
		Card[] cArr = d.getCardList();
		for(int i = 0; i < cArr.length; i++) {
			Card c = cArr[i];
			System.out.println(c.findInfo());
		}
		
		// 랜덤번째 카드 뽑아서 카드 정보 출력
		System.out.println("\n======랜덤카드 뽑기======");
		Card rnd = d.pick();
		System.out.println(rnd.findInfo());
		
		// 51번째 카드 뽑아서 카드 정보 출력
		System.out.println("\n======51번카드 뽑기======");
		Card pick = d.pick(51);
		System.out.println(pick.findInfo());
		
		// 카드 섞기
		d.shuffle();
		
		// 섞은 후 카드 한벌 다시 출력 - 확장 for
		System.out.println("\n======셔플 후 뽑기======");
		for(Card c : cArr) {
			System.out.println(c.findInfo());
		}
	}

}
