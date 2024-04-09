package com.day8.six;

	/*
	 # 객체지향 언어의 3대 특징
	 1. 캡슐화(은닉성)
	 2. 상속성
	 3. 다형성
	 
	 # 상속
	 - 부모 클래스의 멤버들을 물려받아 자식 클래스를 정의하는 기법
	 - 자식 클래스는 부모 클래스의 멤버들을 사용할 수 있다
	 - 공통되는 부분을 부모 클래스에서 관리하고, 
	 	자식 클래스는 자신에게 정의된 멤버들만 관리
	 	
	   상위 클래스(super class) - 기본클래스(base class), 부모클래스, 조상클래스
	   하위 클래스(sub class) - 파생클래스(derived), 자식클래스, 자손클래스
	   
	   자식 클래스의 멤버개수는 부모 클래스와 같거나 많다
	   
	   형식
	   class 클래스이름 extends 부모클래스
	 */
class Parent{
	protected String name;
	protected int age;
	protected int money = 10000;
	
}

class Son extends Parent{
	Son(){
		this.name = "아들";
		this.age = 35;
	}
	
	public void printInfo() {
		System.out.println("나는 " + this.name);
		System.out.println("나이는 " + this.age);
		System.out.println("물려받은 유산은 " + money + "\n");
	}
}

class Daughter extends Parent{
	Daughter(){
		this.name = "딸";
		this.age = 30;
	}
	
	public void printInfo() {
		System.out.println("나는 " + this.name);
		System.out.println("나이는 " + this.age);
		System.out.println("물려받은 유산은 " + money + "\n");
	}
}

class GrandChild extends Son{
	GrandChild(){
		this.name = "손자";
		this.age = 2;
	}
	
}

public class Inheritance1 {
	public static void main(String[] args) {
		Son hong = new Son();
		hong.printInfo();
		
		Daughter d = new Daughter();
		d.printInfo();
		
		/*
		 - Son과 Daughter간에는 서로 아무런 관계도 성립되지 않음
		 - Son과 Daughter 클래스에 공통적으로 추가 되어야하는 멤버가 있다면,
		   부모인 Parent 클래스에 추가
		 */
		
		GrandChild gc = new GrandChild();
		gc.printInfo();
		
		/*
		 자식 클래스의 인스턴스를 생성하면 부모 클래스의 멤버와 
		 자식 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성됨
		 
		 */
	}

}
