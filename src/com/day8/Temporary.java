package com.day8;

public class Temporary {
	
	// 필드
	private String name;
	private int time;
	private int pay;
	
	// 생성자
	Temporary(String name, int time, int pay){
		this.name = name;
		this.time = time;
		this.pay = pay;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	// method
	public int totalPay() {
		return time * pay;
	}

}
