package com.day10;

import java.util.Scanner;

class Person2{
	protected String name;
	protected int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("\n이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student2 extends Person2{
	protected String stNo;
	
	Student2(String name, int age, String stNo){
		super(name, age);
		this.stNo = stNo;
	}
	
	public void showInfo() { // 오버라이딩 메소드
		super.showInfo(); // 부모 메소드 호출
		System.out.println("학번 : " + stNo);
	}
	
	public void study() {
		System.out.println("공부합니다.");
	}
}

class Graduate extends Student2{
	private String major;
	
	Graduate(String name, int age, String stNo, String major){
		super(name, age, stNo);
		this.major = major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
	
	public void write() {
		System.out.println("논문을 씁니다.");
	}
}

public class PersonTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번, 전공을 입력하세요.");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String stNo = sc.nextLine();
		String major = sc.nextLine();
		
		Student2 s = new Student2(name, age, stNo);
		s.showInfo();
		s.study();
		
		Graduate g = new Graduate(name, age, stNo, major);
		g.showInfo();
		g.write();
	}

}
