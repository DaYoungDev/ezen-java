package com.day8.six;

import java.util.Scanner;

class Human{
	// 필드
	protected String name;
	protected int age;
	
	// getter/setter
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

class Teacher extends Human{
	// 필드
	private String object;

	// getter / setter
	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}
	
	// 메소드
	public void work() {
		System.out.println("가르친다");
	}
}

class Programmer extends Human{
	// 필드
	private int career;

	// getter / setter
	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	
	// 메소드
	public void work() {
		System.out.println("프로그래밍한다.");
	}
}

public class HumanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 과목을 입력하세요");
		
		Teacher t1 = new Teacher();
		t1.setName(sc.nextLine());
		t1.setAge(sc.nextInt());
		sc.nextLine();
		t1.setObject(sc.nextLine());
		System.out.println("이름 :" + t1.getName());
		System.out.println("나이 :" + t1.getAge());
		System.out.println("과목 :" + t1.getObject());
		t1.work();
		
		System.out.println("이름, 나이, 경력을 입력하세요");
		
		Programmer p1 = new Programmer();
		p1.setName(sc.nextLine());
		p1.setAge(sc.nextInt());
		p1.setCareer(sc.nextInt());
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		System.out.println("경력 : " + p1.getCareer());
		p1.work();
		
	}

}
