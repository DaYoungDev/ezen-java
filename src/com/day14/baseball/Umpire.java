package com.day14.baseball;

class BallCount{
	private int strike;
	private int ball;

	BallCount(int strike, int ball){
		this.strike = strike;
		this.ball = ball;
	}

	public int getStrike() {
		return strike;
	}
	public int getBall() {
		return ball;
	}
}

public class Umpire {

	public BallCount count(int[] numberArr, int[] hArr) {
		int strike = 0;
		int ball = 0;

		for(int i = 0; i < numberArr.length; i++) {
			if(numberArr[i] == hArr[i]) {
				strike++;
			}
		}

		for(int i = 0; i < numberArr.length; i++) {
			for (int j = 0; j < hArr.length; j++) {
	            if (i != j && numberArr[i] == hArr[j]) {
	                ball++;
	                break; // 중복 카운트 방지
	            }
	        }
		}

		BallCount bCount = new BallCount(strike, ball);
		return bCount;
	}
}
