package com.day9;

public class PhoneInfo {
	private String name;
	private String number;
	private String birth;
	
	public PhoneInfo(String name, String number, String birth) {
		this.name = name;
		this.number = number;
		this.birth = birth;
	}

	// getter
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getBirth() {
		return birth;
	}
	
	
}
