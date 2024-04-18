package com.day14.baseball;

public class Pitcher {
	private int[] numberArr = new int[3];
	
	public void random() {
		for(int i = 0; i < numberArr.length; i++) {
			numberArr[i] = (int)(Math.random() * 10);
			for(int j = 0; j < i; j++) {
				if(numberArr[i] == numberArr[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public int[] getnumberArr(){
		return numberArr;
	}
}
