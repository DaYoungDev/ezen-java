package com.day10;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends Person{
	private String major;
	
	Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
	
	public void showInfo() { // 오버라이딩 메소드
		super.showInfo(); // 부모 메소드 호출
		System.out.println("전공 : " + major + "\n");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전공을 입력하세요.");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
		
		Student s = new Student(name, age, major);
		s.showInfo();
	}

}
