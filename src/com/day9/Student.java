package com.day9;

public class Student {
	// 필드
	private String name;
	private int idNo;
	
	// 생성자
	public Student(String name, int idNo) {
		this.name = name;
		this.idNo = idNo;
	}
	
	// 출력메소드
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("학번 : " + this.idNo);
		System.out.println("===============\n");
	}
}
