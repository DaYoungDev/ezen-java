package com.day7;

public class PhoneInfo {
	// 필드
	private String name;
	private String phone;
	private String birth;
	
	// 생성자
	PhoneInfo(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	PhoneInfo(String name, String phone, String birth){
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		if(birth != null) {
			System.out.println("birth : " + birth);
		}
	}
}
