package com.day8.six;

public class PersonTest {

	public static void main(String[] args) {
		System.out.println("static");
		System.out.println("static count = " + Person.count);
		
		/*
		 static - 클래스 차원에서 바로 호출가능
		 		  클래스의 이름으로 접근
		 		  
		 		  클래스명.static 변수
		 		  클래스명.static 메소드()
		 */
		
		Person hong = new Person("홍길동", 23);
		hong.display();
		
		Person kim = new Person("김길수", 20);
		kim.display();
		
		/*
		 method는 공유, 멤버변수는 객체별로 따로 할당됨
		 */
	}

}
