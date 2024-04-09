package com.day8.six;

import java.util.Scanner;

class People{
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Student extends People{
	private String major;
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}

public class Inheritance2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전공 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
		
		Student st = new Student();
		st.setName(name);
		st.setAge(age);
		st.setMajor(major);
		
		System.out.println("이름 : " + st.getName());
		System.out.println("나이 : " + st.getAge());
		System.out.println("전공 : " + st.getMajor());
	}

}
