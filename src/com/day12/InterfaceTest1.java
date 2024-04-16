package com.day12;

import java.util.Scanner;

/*
 인터페이스(interface)
 - 일종의 추상 클래스
 - 추상메소드와 상수만을 멤버로 가질 수 있다
 - 메소드 목록만을 가지는 특별한 타입
 - 자식클래스가 구현해야할 기능을 나열해 놓은 것
 - 미리 정래진 규칙에 맞게 구현하도록 표준을 제시하는 데 사용됨
 - 인터페이스는 계약, 일종의 약속으로 최소한의 계약사항을 명시할 뿐
   
 # 인터페이스 선언
 interface 인터페이스이름{
 	public static final 타입 상수이름 = 값;
 	public abstract 반환타입 메소드이름(매개변수);
 }
 
 => 모든 상수는 public static final이어야하며, 이를 생략할 수 있다
    모든 메소드는 public abstract이어야하며, 이를 생략할 수 있다
    
 # 인터페이스의 구현
 class 클래스이름 implements 인터페이스이름 {
 
 }
 
 - 인터페이스는 객체생성 불가
 - 인터페이스의 메소드 중 일부만 구현한다면, 자식도 추상클래스로 선언해야함
 */

interface IAnimal{
	public abstract void sound();
	void showInfo(); // public abstract 생략가능
}

class Cat1 implements IAnimal{
	public void sound() {
		System.out.println("야옹");
	}
	public void showInfo() {
		System.out.println("Cat의 showInfo()");
	}
}

abstract class Dog1 implements IAnimal{
	public void sound() {
		System.out.println("멍멍");
	}
	
	// showInfo()는 구현하지 않았으므로 자식도 추상 클래스
}

class Cow implements IAnimal{
	public void sound() {
		System.out.println("음메");
	}
	
	/*
	void showInfo() { // error
		// Cannot reduce the visibility of the inherited method from IAnimal
		// 부모 메소드를 오버라이딩 할때 접근 제한자는 부모보다 넓어야하므로 
		// public을 생략하여 default로 사용할 수 없다 
		System.out.println("Cow의 showInfo()");
	}
	*/
	
	public void showInfo() {
		System.out.println("Cow의 showInfo()");
	}
}

public class InterfaceTest1 {
	public static void main(String[] args) {
		// IAnimal ani = new IAnimal(); // error : 인터페이스 객체생성불가
		// Dog d = new Dog(); // error : 추상클래스
		Cat1 c = new Cat1();
		c.sound();
		c.showInfo();
		
		// 다형성
		System.out.println("\n======다형성======");
		IAnimal an = new Cat1();
		an.sound();
		an.showInfo();
		
		an = new Cow();
		an.sound();
		an.showInfo();
		
		// 배열에 넣기
		Scanner sc = new Scanner(System.in);
	      System.out.println("\n선택!<1.고양이 2.개 3.소>");
	      int type=sc.nextInt();
	      
	      if(type==1) {
	         an = new Cat1();
	      }else if(type==2) {
	         System.out.println("Dog2는 추상클래스");
	         return;
	      }else if(type==3){
	         an=new Cow();
	      }else {
	         System.out.println("잘못된 선택");
	         return;
	      }
	      
	      an.sound();
	      an.showInfo();
	}

}
