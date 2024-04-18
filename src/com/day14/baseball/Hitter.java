package com.day14.baseball;

public class Hitter {
	private int[] hArr = new int[3];
	
	public Hitter(int a, int b, int c) {
		hArr[0] = a;
		hArr[1] = b;
		hArr[2] = c;
	}
	
	public int[] getHArr() {
		return hArr;
	}
}
