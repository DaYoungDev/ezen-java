package com.day8.six;

public class Person {
	//1. 멤버변수(인스턴스 변수) 
	private String name; 
	private int age;
	
	// static 변수(클래스변수)
	// - 클래스 차원에서 하나만 생성되어 모든 객체가 공유한다
	// - 해당 클래스가 메모리에 로드될 때 생성됨
	// (자바는 필요한 클래스 파일만 메모리 공간에 올리는 방식으로 실행됨)
	static int count = 0;
	
	/*
	 [1] 인스턴스 변수는 객체별로 따로 할당
	 [2] static 변수는 하나만 생성되어 공유
	 */
	
	//2. 생성자
	public Person(String name, int age) 
	{
		this.name = name; 
		this.age = age;
		System.out.println(++count + "번째 객체 생성!");
		
	}
	//3. 메서드
	
	public void display() 
	{
		System.out.println("이름 : " + name); 
		System.out.println("나이 : " + age + "\n");
	}

}
