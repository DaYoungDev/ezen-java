package com.day14.thirteen;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Object의 toString() 오버라이딩
	// public String toString()
	public String toString() {
		return "Member[id = " + id + ", name = " + name + "]";
				
	}
	
	public void showInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name + "\n");
	}
}
