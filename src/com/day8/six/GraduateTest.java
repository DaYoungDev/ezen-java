package com.day8.six;

import java.util.Scanner;

class Person2 {
	// 필드
	protected String name;
	protected int age;
	
	// getter / setter
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

class Student2 extends Person2{
	// 필드
	protected int studentNumber;

	// getter / setter
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	// 메소드
	public void study() {
		System.out.println("공부한다");
	}
}

class Graduate extends Student2{
	// 필드
	private String major;

	// getter / setter
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 메소드
	public void writeThesis() {
		System.out.println("논문을 쓴다.");
	}
}
public class GraduateTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
		
		Graduate g = new Graduate();
		g.setName(sc.nextLine());
		g.setAge(sc.nextInt());
		g.setStudentNumber(sc.nextInt());
		sc.nextLine();
		g.setMajor(sc.nextLine());
		
		System.out.println("이름 : " + g.getName());
		System.out.println("나이 : " + g.getAge());
		System.out.println("학번 : " + g.getStudentNumber());
		System.out.println("전공 : " + g.getMajor());
		g.writeThesis();
	}

}
