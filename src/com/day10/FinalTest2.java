package com.day10;

class AAA{
	final public static double PI = 3.141592;
	public final int DELIVERY = 3000;
	int age = 10;
}

public class FinalTest2 {
	public static void main(String[] args) {
		final double INTEREST_RATE = 0.03;
		
		AAA obj = new AAA();
		
		System.out.println("PI : " + AAA.PI);
		System.out.println("배송비 :" + obj.DELIVERY);
		System.out.println("이자율 : " + INTEREST_RATE);
		
		obj.age = 15; // 변수는 값 변경 가능
		//obj.DELIVERY = 5000; // error : 상수는 값변경 불가
		// => The final field AAA.DELIVERY cannot be assigned
		//AAA.PI = 3.14; // error
		//INTEREST_RATE = 0.04; // error
	}

}
