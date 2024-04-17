package com.day13.eleven;

//사과개수와 거스름돈을 담을 클래스
public class FruitResult {
	private int num;
	private int change;
	
	public FruitResult() {
		super();
	}

	public FruitResult(int num, int change) {
		super();
		this.num = num;
		this.change = change;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
	
	
}