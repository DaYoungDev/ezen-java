package com.day7;

import java.util.Scanner;

class Person{
	// 1. 필드
	private String name;
	private int age;
	private String phone;
	
	// 2. 생성자
	Person(String name, String phone, int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	// 3. getter / setter
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 4. 메소드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("나이 : " + age + "\n");
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 나이를 입력하세요");
		String name = sc.nextLine();
		String phone = sc.nextLine();
		int age = sc.nextInt();
		Person p = new Person(name, phone, age);
		p.showInfo();
		
		// 멤버변수 값 변경 - setter이용
		p.setAge(25);
		p.setName("김길수");
		p.setPhone("010-8000-9000");
		p.showInfo();
		
		System.out.println("이름 : " + p.getName());
		System.out.println("전화번호 : " + p.getPhone());
		System.out.println("나이 : " + p.getAge() + "\n");
	}

}
