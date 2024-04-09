package com.day8.six;

public class Game {
	// 필드
	private String hChoice;
	private String comChoice;
	private String result;
	
	// getter
	public String gethChoice() {
		return hChoice;
	}
	public String getComChoice() {
		return comChoice;
	}
	public String getResult() {
		return result;
	}

	// 메소드
	public void compare(int h, int c) {
		if(h == 0) {
			hChoice = "가위";
		} else if(h == 1) {
			hChoice = "바위";
		} else if(h == 2) {
			hChoice = "보";
		}
		
		if(c == 0) {
			comChoice = "가위";
		} else if(c == 1) {
			comChoice = "바위";
		} else if(c == 2) {
			comChoice = "보";
		}
		
		int i = (h - c + 3) % 3;
		if(i == 1) {
			result  = "이겼다.";
		} else if(i == 2) {
			result = "졌다.";
		} else if(i == 0) {
			result = "비겼다.";
		}
		
	}
}
