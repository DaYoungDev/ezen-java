package com.day13.eleven;

public class Child {
	private int numOfBead;
	
	Child(int numOfBead){
		this.numOfBead = numOfBead;
	}
	
	public void loseBead(int loseCount) {
		if(numOfBead < loseCount) {
			numOfBead = 0;
		} else {
			numOfBead -= loseCount;
		}
	}
	
	public void obtainBead(Child child, int obtainCount) {
		child.loseBead(obtainCount);
		numOfBead += obtainCount;
	}

	public void showProperty() {
		System.out.println("보유 구슬의 개수 : " + numOfBead);
	}
}
